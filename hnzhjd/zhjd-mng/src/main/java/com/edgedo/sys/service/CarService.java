package com.edgedo.sys.service;
		
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.edgedo.common.util.Guid;
import com.edgedo.sys.entity.Car;
import com.edgedo.sys.mapper.CarMapper;
import com.edgedo.sys.queryvo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;import org.springframework.transaction.annotation.Propagation;import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED,rollbackFor=Exception.class)
public class CarService {
	
	
	@Autowired
	private CarMapper mapper;

	@Transactional(propagation = Propagation.REQUIRED,rollbackFor=Exception.class,readOnly = true)
	public List<CarView> listPage(CarQuery query){
		List<CarView> list = mapper.listPage(query);
		for(CarView cv : list){
			OrgView ov = mapper.selectOrgId(cv.getOrgId());
			cv.setOrgDepartment(ov.getName());
		}
		query.setList(list);
		return list;
	}

	/***
	 * 新增方法
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor=Exception.class)
	public String insert(Car voObj) {
		voObj.setDeleted(true);
		mapper.insertCar(voObj);
		return "";
	}
	
	/***
	 * 动态修改方法
	 * @param
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor=Exception.class)
	public String update(Car voObj) {
		mapper.updateByIdCar(voObj);
		return "";
	}
	
	/***
	 * 全修改
	 * @param
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor=Exception.class)
	public String updateAll(Car voObj) {
		mapper.updateAllColumnById(voObj);
		return "";
	}
	
	
	
	/**
	 * 单个删除
	 * @param id
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor=Exception.class)
	public int delete(String id) {

		return mapper.deleteByIdCar(id);

	}
	
	/**
	 * 批量删除
	 * @param ids
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor=Exception.class)
	public int deleteByIds(List<String> ids) {
		
		return mapper.deleteBatchIds(ids);
	}
	
	
	
	/**
	 * 加载单个
	 * @param id
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor=Exception.class,readOnly = true)
	public Car loadById(String id) {
		return mapper.selectById(id);
	}

	/**
	 * 逻辑删除
	 * @param list
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor=Exception.class)
    public int deleteByIdsLogic(List<String> ids) {
//逻辑删除
		if(ids.size()==0){
			return 0;
		}
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("ids",ids);
		return mapper.deleteByIdsLogic(param);
    }
}
