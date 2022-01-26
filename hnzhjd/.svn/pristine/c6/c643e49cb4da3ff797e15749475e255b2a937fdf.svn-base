package com.edgedo.sys.mapper;

import java.util.List;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.edgedo.sys.entity.Driver;
import com.edgedo.sys.queryvo.DriverQuery;
import com.edgedo.sys.queryvo.DriverView;
import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface DriverMapper  extends BaseMapper<Driver>{
	
	/**
	 * 分页条件查询
	 * @param query
	 * @return
	 */
	public List<DriverView> listPage(DriverQuery query);
	
	/**
	 * 不分页条件查询
	 * @param query
	 * @return
	 */
	public List<DriverView> listByObj(DriverQuery query);
	
	

}