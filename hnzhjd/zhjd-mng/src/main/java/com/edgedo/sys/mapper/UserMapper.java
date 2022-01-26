package com.edgedo.sys.mapper;

import java.util.List;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.edgedo.sys.entity.User;
import com.edgedo.sys.queryvo.UserQuery;
import com.edgedo.sys.queryvo.UserView;
import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface UserMapper  extends BaseMapper<User>{
	
	/**
	 * 分页条件查询
	 * @param query
	 * @return
	 */
	public List<UserView> listPage(UserQuery query);
	
	/**
	 * 不分页条件查询
	 * @param query
	 * @return
	 */
	public List<UserView> listByObj(UserQuery query);
	
	

}