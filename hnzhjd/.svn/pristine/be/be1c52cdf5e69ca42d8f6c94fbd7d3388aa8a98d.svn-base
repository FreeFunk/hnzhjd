package com.edgedo.sys.mapper;

import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.edgedo.sys.entity.Restaurant;
import com.edgedo.sys.queryvo.RestaurantQuery;
import com.edgedo.sys.queryvo.RestaurantView;
import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface RestaurantMapper  extends BaseMapper<Restaurant>{
	
	/**
	 * 分页条件查询
	 * @param query
	 * @return
	 */
	public List<RestaurantView> listPage(RestaurantQuery query);
	
	/**
	 * 不分页条件查询
	 * @param query
	 * @return
	 */
	public List<RestaurantView> listByObj(RestaurantQuery query);

	/**
	 * 将所有的都修改成不默认
	 */
	void updateAllNotDefault(Integer orgId);
	//逻辑删除
	int deleteByIdsLogic(Map<String, Object> param);
}