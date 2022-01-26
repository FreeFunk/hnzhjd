package com.edgedo.sys.mapper;

import java.util.List;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.edgedo.sys.entity.RoomArrangeDetail;
import com.edgedo.sys.queryvo.RoomArrangeDetailQuery;
import com.edgedo.sys.queryvo.RoomArrangeDetailView;
import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface RoomArrangeDetailMapper  extends BaseMapper<RoomArrangeDetail>{
	
	/**
	 * 分页条件查询
	 * @param query
	 * @return
	 */
	public List<RoomArrangeDetailView> listPage(RoomArrangeDetailQuery query);
	
	/**
	 * 不分页条件查询
	 * @param query
	 * @return
	 */
	public List<RoomArrangeDetailView> listByObj(RoomArrangeDetailQuery query);
	
	

}