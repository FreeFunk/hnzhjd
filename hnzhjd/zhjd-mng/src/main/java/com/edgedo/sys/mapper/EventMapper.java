package com.edgedo.sys.mapper;

import java.util.List;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.edgedo.sys.entity.Event;
import com.edgedo.sys.queryvo.EventQuery;
import com.edgedo.sys.queryvo.EventView;
import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface EventMapper  extends BaseMapper<Event>{
	
	/**
	 * 分页条件查询
	 * @param query
	 * @return
	 */
	public List<EventView> listPage(EventQuery query);
	
	/**
	 * 不分页条件查询
	 * @param query
	 * @return
	 */
	public List<EventView> listByObj(EventQuery query);
	
	

}