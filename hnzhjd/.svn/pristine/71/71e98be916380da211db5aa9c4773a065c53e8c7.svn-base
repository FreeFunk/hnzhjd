package com.edgedo.sys.mapper;

import java.util.List;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.edgedo.sys.entity.Reception;
import com.edgedo.sys.queryvo.ReceptionQuery;
import com.edgedo.sys.queryvo.ReceptionView;
import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface ReceptionMapper  extends BaseMapper<Reception>{
	
	/**
	 * 分页条件查询
	 * @param query
	 * @return
	 */
	public List<ReceptionView> listPage(ReceptionQuery query);
	
	/**
	 * 不分页条件查询
	 * @param query
	 * @return
	 */
	public List<ReceptionView> listByObj(ReceptionQuery query);
	
	

}