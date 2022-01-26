package com.edgedo.sys.mapper;

import java.util.List;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.edgedo.sys.entity.Hotel;
import com.edgedo.sys.queryvo.HotelQuery;
import com.edgedo.sys.queryvo.HotelView;
import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface HotelMapper  extends BaseMapper<Hotel>{
	
	/**
	 * 分页条件查询
	 * @param query
	 * @return
	 */
	public List<HotelView> listPage(HotelQuery query);
	
	/**
	 * 不分页条件查询
	 * @param query
	 * @return
	 */
	public List<HotelView> listByObj(HotelQuery query);

	//逻辑删除
	public void logicdeleteById(int id);

}