package com.edgedo.sys.service;
		
import java.util.List;

import com.edgedo.common.util.Guid;
import com.edgedo.sys.entity.Hotel;
import com.edgedo.sys.mapper.HotelMapper;
import com.edgedo.sys.queryvo.HotelQuery;
import com.edgedo.sys.queryvo.HotelView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;import org.springframework.transaction.annotation.Propagation;import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
@Transactional(propagation = Propagation.REQUIRED,rollbackFor=Exception.class)
public class HotelService {
	
	
	@Autowired
	private HotelMapper mapper;

	@Transactional(propagation = Propagation.REQUIRED,rollbackFor=Exception.class,readOnly = true)
	public List<HotelView> listPage(HotelQuery query){
		List list = mapper.listPage(query);
		query.setList(list);
		return list;
	}
	
	/***
	 * 新增方法
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor=Exception.class)
	public String insert(Hotel voObj) {

		mapper.insert(voObj);
		return "";
	}
	
	/***
	 * 动态修改方法
	 * @param
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor=Exception.class)
	public String update(Hotel voObj) {
		mapper.updateById(voObj);
		return "";
	}
	
	/***
	 * 全修改
	 * @param
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor=Exception.class)
	public String updateAll(Hotel voObj) {
		mapper.updateAllColumnById(voObj);
		return "";
	}
	
	
	
//	/**
//	 * 单个删除
//	 * @param id
//	 */
//	@Transactional(propagation = Propagation.REQUIRED,rollbackFor=Exception.class)
//	public int delete(String id) {
//
//		return mapper.deleteById(id);
//	}

    /**
     * 单个删除
     * @param id
     */
    public int delete(String id){
        //mapper.logicdeleteById(id);
        return 0;
    }
	/**
	 * 批量删除
	 * @param ids
	 */
//	@Transactional(propagation = Propagation.REQUIRED,rollbackFor=Exception.class)
//	public int deleteByIds(List<String> ids) {
//
//		return mapper.deleteBatchIds(ids);
//	}
    public int deleteByIds(List<String> ids) {

        //进行删除与ids相关的数据userIdRoleId;
        for(String userId : ids){
            //删除user_role表中的这个user的所有数据;
            //sysUserRoleService.deleteByUserId(userId);
			int uId = Integer.parseInt(userId);
            mapper.logicdeleteById(uId);
        }
        return 0;
    }
	
	
	/**
	 * 加载单个
	 * @param id
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor=Exception.class,readOnly = true)
	public Hotel loadById(String id) {
		return mapper.selectById(id);
	}
	


}
