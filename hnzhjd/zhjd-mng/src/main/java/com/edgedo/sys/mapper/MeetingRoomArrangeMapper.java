package com.edgedo.sys.mapper;

import java.util.List;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.edgedo.sys.entity.MeetingRoomArrange;
import com.edgedo.sys.queryvo.MeetingRoomArrangeQuery;
import com.edgedo.sys.queryvo.MeetingRoomArrangeView;
import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface MeetingRoomArrangeMapper  extends BaseMapper<MeetingRoomArrange>{
	
	/**
	 * 分页条件查询
	 * @param query
	 * @return
	 */
	public List<MeetingRoomArrangeView> listPage(MeetingRoomArrangeQuery query);
	
	/**
	 * 不分页条件查询
	 * @param query
	 * @return
	 */
	public List<MeetingRoomArrangeView> listByObj(MeetingRoomArrangeQuery query);
	
	int selectMtraCountByEventId(int eventId);

}