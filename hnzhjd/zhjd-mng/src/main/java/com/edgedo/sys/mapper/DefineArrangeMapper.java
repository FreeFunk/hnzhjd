package com.edgedo.sys.mapper;

import java.util.List;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.edgedo.sys.entity.DefineArrange;
import com.edgedo.sys.queryvo.DefineArrangeQuery;
import com.edgedo.sys.queryvo.DefineArrangeView;
import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface DefineArrangeMapper  extends BaseMapper<DefineArrange>{
	
	/**
	 * 分页条件查询
	 * @param query
	 * @return
	 */
	public List<DefineArrangeView> listPage(DefineArrangeQuery query);
	
	/**
	 * 不分页条件查询
	 * @param query
	 * @return
	 */
	public List<DefineArrangeView> listByObj(DefineArrangeQuery query);
	
	int selectDefineCountByEventId(int eventId);

}