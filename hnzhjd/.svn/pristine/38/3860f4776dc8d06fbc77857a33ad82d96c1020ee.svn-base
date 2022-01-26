package com.edgedo.sys.mapper;

import java.util.List;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.edgedo.sys.entity.PickupArrange;
import com.edgedo.sys.queryvo.PickupArrangeQuery;
import com.edgedo.sys.queryvo.PickupArrangeView;
import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface PickupArrangeMapper  extends BaseMapper<PickupArrange>{
	
	/**
	 * 分页条件查询
	 * @param query
	 * @return
	 */
	public List<PickupArrangeView> listPage(PickupArrangeQuery query);
	
	/**
	 * 不分页条件查询
	 * @param query
	 * @return
	 */
	public List<PickupArrangeView> listByObj(PickupArrangeQuery query);

	int selectCountByEventId(int eventId);
	
	

}