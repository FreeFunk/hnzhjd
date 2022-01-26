package com.edgedo.sys.mapper;

import java.util.List;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.edgedo.sys.entity.Attendance;
import com.edgedo.sys.queryvo.AttendanceQuery;
import com.edgedo.sys.queryvo.AttendanceView;
import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface AttendanceMapper  extends BaseMapper<Attendance>{
	
	/**
	 * 分页条件查询
	 * @param query
	 * @return
	 */
	public List<AttendanceView> listPage(AttendanceQuery query);
	
	/**
	 * 不分页条件查询
	 * @param query
	 * @return
	 */
	public List<AttendanceView> listByObj(AttendanceQuery query);
	
	

}