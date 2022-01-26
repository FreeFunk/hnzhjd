package com.edgedo.sys.service;
		
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.edgedo.common.util.Guid;
import com.edgedo.sys.entity.Restaurant;
import com.edgedo.sys.mapper.RestaurantMapper;
import com.edgedo.sys.queryvo.RestaurantQuery;
import com.edgedo.sys.queryvo.RestaurantView;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;import org.springframework.transaction.annotation.Propagation;import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED,rollbackFor=Exception.class)
public class RestaurantService {
	
	
	@Autowired
	private RestaurantMapper mapper;

	@Transactional(propagation = Propagation.REQUIRED,rollbackFor=Exception.class,readOnly = true)
	public List<RestaurantView> listPage(RestaurantQuery query){
		List list = mapper.listPage(query);
		query.setList(list);
		return list;
	}
	
	/***
	 * 新增方法
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor=Exception.class)
	public String insert(Restaurant voObj) {
		Boolean asDefault = voObj.getAsDefault();
		if(asDefault!=null && asDefault==true){
			mapper.updateAllNotDefault(voObj.getOrgId());
		}
		mapper.insert(voObj);
		return "";
	}


	/***
	 * 动态修改方法
	 * @param
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor=Exception.class)
	public String update(Restaurant voObj) {
		Boolean asDefault = voObj.getAsDefault();
		if(asDefault!=null && asDefault==true){
			mapper.updateAllNotDefault(voObj.getOrgId());
		}
		mapper.updateById(voObj);
		return "";
	}
	
	/***
	 * 全修改
	 * @param
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor=Exception.class)
	public String updateAll(Restaurant voObj) {
		mapper.updateAllColumnById(voObj);
		return "";
	}
	
	
	
	/**
	 * 单个删除
	 * @param id
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor=Exception.class)
	public int delete(Integer id) {
		Restaurant voObj = new Restaurant();
		voObj.setId(id);
		voObj.setDeleted(true);
		return mapper.deleteById(id);
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
	public Restaurant loadById(String id) {
		return mapper.selectById(id);
	}

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
