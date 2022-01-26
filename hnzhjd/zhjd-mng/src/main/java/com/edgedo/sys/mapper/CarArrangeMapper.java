package com.edgedo.sys.mapper;

import java.util.List;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.edgedo.sys.entity.CarArrange;
import com.edgedo.sys.queryvo.CarArrangeQuery;
import com.edgedo.sys.queryvo.CarArrangeView;
import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface CarArrangeMapper  extends BaseMapper<CarArrange>{
	
	/**
	 * 分页条件查询
	 * @param query
	 * @return
	 */
	public List<CarArrangeView> listPage(CarArrangeQuery query);
	
	/**
	 * 不分页条件查询
	 * @param query
	 * @return
	 */
	public List<CarArrangeView> listByObj(CarArrangeQuery query);

	int selectCountByEventId(int eventId);
	
	

}