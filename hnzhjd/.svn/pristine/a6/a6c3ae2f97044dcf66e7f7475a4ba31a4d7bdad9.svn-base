package com.edgedo.sys.controller;


import java.util.ArrayList;
import java.util.List;

import com.edgedo.common.base.BaseController;
import com.edgedo.common.shiro.User;
import com.edgedo.sys.entity.Car;
import com.edgedo.sys.entity.SysUser;
import com.edgedo.sys.queryvo.CarQuery;
import com.edgedo.sys.queryvo.CarView;
import com.edgedo.sys.service.CarService;
import com.edgedo.sys.service.SysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Api(tags = "Car")
@Controller
@RequestMapping("/admin/car")
public class CarController extends BaseController{
	
	@Autowired
	private CarService service;
	@Autowired
	private SysUserService sysUserService;
	
	/**
	 * 分页查询
	 * @param query
	 * @return
	 */
	@ApiOperation(value = "分页查询Car", notes = "分页查询Car")
	@ApiImplicitParam(name = "access-token", value = "用户登录秘钥", paramType = "header", required = true, dataType = "String")
	@RequestMapping(value = "/listpage",method = RequestMethod.POST)
	public ModelAndView listpage(@ModelAttribute CarQuery query){
		ModelAndView modelAndView = new ModelAndView();
		User user = getLoginUser();
		String userId = user.getUserId();
		SysUser sysUser = sysUserService.loadById(userId);
		String deptId = sysUser.getDeptId();
		Integer orgId = new Integer(deptId);
		query.getQueryObj().setOrgId(orgId);
		service.listPage(query);
		buildResponse(modelAndView,query);
		return modelAndView;
	}

	/**
	 * 新增修改
	 * @param voObj
	 * @return
	 */
	@ApiOperation(value = "新增修改Car", notes = "新增修改Car")
	@ApiImplicitParam(name = "access-token", value = "用户登录秘钥", paramType = "header", required = true, dataType = "String")
	@RequestMapping(value = "/saveOrUpdate",method = RequestMethod.POST)
	public ModelAndView saveOrUpdate(Car voObj){
		ModelAndView modelAndView = new ModelAndView();
		String errMsg = "";
		User user = getLoginUser();
		String userId = user.getUserId();
		SysUser sysUser = sysUserService.loadById(userId);
		String deptId = sysUser.getDeptId();
		Integer orgId = new Integer(deptId);
		voObj.setOrgId(orgId);
		Integer id = voObj.getId();
		if(id==null){
			errMsg = service.insert(voObj);
		}else{
			errMsg = service.update(voObj);
		}
		if(errMsg!=null && !errMsg.equals("")){
			buildErrorResponse(modelAndView, errMsg);
		}else{
			buildResponse(modelAndView);
		}
		return modelAndView;
	}
	
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@ApiOperation(value = "根据ID批量删除Car", notes = "根据ID批量删除Car")
	@ApiImplicitParam(name = "access-token", value = "用户登录秘钥", paramType = "header", required = true, dataType = "String")
	@RequestMapping(value = "/deleteByIds",method = RequestMethod.POST)
	public ModelAndView delete(String ids){
		ModelAndView modelAndView = new ModelAndView();
		String[] arr = ids.split(",");
		List<String> list = new ArrayList<String>();
		if(arr.length==1){
			service.delete(ids);
		}else{
			for(String str : arr){
				list.add(str);
			}
			service.deleteByIdsLogic(list);
		}
		return buildResponse(modelAndView);
	}
	
	
	/**
	 * 根据主键加载
	 * @param id
	 * @return
	 */
	@ApiOperation(value = "根据ID加载Car", notes = "根据ID加载Car")
	@ApiImplicitParam(name = "access-token", value = "用户登录秘钥", paramType = "header", required = true, dataType = "String")
	@RequestMapping(value = "/loadById",method = RequestMethod.POST)
	public ModelAndView  loadById(String id){
		ModelAndView modelAndView = new ModelAndView();
		return buildResponse(modelAndView, service.loadById(id));
	}
	
	
}
