package com.edgedo.sys.mapper;

import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.edgedo.sys.entity.Car;
import com.edgedo.sys.queryvo.CarQuery;
import com.edgedo.sys.queryvo.CarView;
import com.edgedo.sys.queryvo.OrgView;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface CarMapper  extends BaseMapper<Car>{
	
	/**
	 * 分页条件查询
	 * @param query
	 * @return
	 */
	public List<CarView> listPage(CarQuery query);

	/**
	 * 不分页条件查询
	 * @param query
	 * @return
	 */
	public List<CarView> listByObj(CarQuery query);

	/**
	 * 插入操作
	 * @param car
	 */
	public void insertCar(Car car);

	/**
	 * 动态修改
	 * @param car
	 */
	public void updateByIdCar(Car car);

	/**
	 * 单个删除
	 * @param id
	 */
	public int deleteByIdCar(@Param("ById") String id);

	/**
	 * 根据组织id获取到org表中的name值，返回OrgView对象
	 * @param orgId
	 * @return
	 */
	public OrgView selectOrgId(@Param("orgDepartment") Integer orgId);

	/**
	 * 逻辑删除
	 * @param param
	 * @return
	 */
    int deleteByIdsLogic(Map<String, Object> param);

}