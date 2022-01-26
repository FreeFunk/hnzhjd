package com.edgedo.sys.mapper;

import java.util.List;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.edgedo.sys.entity.MeetingRoom;
import com.edgedo.sys.queryvo.MeetingRoomQuery;
import com.edgedo.sys.queryvo.MeetingRoomView;
import com.edgedo.sys.queryvo.OrgView;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface MeetingRoomMapper  extends BaseMapper<MeetingRoom>{
	
	/**
	 * 分页条件查询
	 * @param query
	 * @return
	 */
	public List<MeetingRoomView> listPage(MeetingRoomQuery query);
	
	/**
	 * 不分页条件查询
	 * @param query
	 * @return
	 */
	public List<MeetingRoomView> listByObj(MeetingRoomQuery query);
	
	
	public int deleteByIdRoom(@Param("ById") String id);

	/**
	 * 根据组织id获取到org表中的name值，返回OrgView对象
	 * @param orgId
	 * @return
	 */
	public OrgView selectOrgId(@Param("orgDepartment") Integer orgId);
}