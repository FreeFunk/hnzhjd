package com.edgedo.sys.controller;


import java.util.ArrayList;
import java.util.List;

import com.edgedo.common.base.BaseController;
import com.edgedo.common.shiro.User;
import com.edgedo.sys.entity.Org;
import com.edgedo.sys.entity.Reception;
import com.edgedo.sys.entity.SysUser;
import com.edgedo.sys.queryvo.OrgView;
import com.edgedo.sys.queryvo.ReceptionQuery;
import com.edgedo.sys.service.OrgService;
import com.edgedo.sys.service.ReceptionService;
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


@Api(tags = "Reception")
@Controller
@RequestMapping("/admin/reception")
public class ReceptionController extends BaseController{
	
	@Autowired
	private ReceptionService service;
	@Autowired
	private OrgService orgService;
	@Autowired
	private SysUserService sysUserService;
	
	/**
	 * 分页查询
	 * @param query
	 * @return
	 */
	@ApiOperation(value = "分页查询Reception", notes = "分页查询Reception")
	@ApiImplicitParam(name = "access-token", value = "用户登录秘钥", paramType = "header", required = true, dataType = "String")
	@RequestMapping(value = "/listpage",method = RequestMethod.POST)
	public ModelAndView listpage(@ModelAttribute ReceptionQuery query){
		ModelAndView modelAndView = new ModelAndView();
		User user = User.getCurrentUser();
		String htUserId = user.getUserId();
		SysUser sysUser = sysUserService.loadById(htUserId);
		if(sysUser != null){
			Integer dataOrgId = Integer.parseInt(sysUser.getDeptId());
			query.getQueryObj().setDataOrgId(dataOrgId);
		}
		service.listPage(query);
		buildResponse(modelAndView,query);
		return modelAndView;
	}
	

	/**
	 * 新增修改
	 * @param voObj
	 * @return
	 */
	@ApiOperation(value = "新增修改Reception", notes = "新增修改Reception")
	@ApiImplicitParam(name = "access-token", value = "用户登录秘钥", paramType = "header", required = true, dataType = "String")
	@RequestMapping(value = "/saveOrUpdate",method = RequestMethod.POST)
	public ModelAndView saveOrUpdate(Reception voObj){
		ModelAndView modelAndView = new ModelAndView();
		String errMsg = "";
		Integer id = voObj.getId();
		if(id==null){
			Org org = orgService.loadById(voObj.getOrgId());
			if(org != null){
				voObj.setOrgName(org.getName());
			}
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
	@ApiOperation(value = "根据ID批量删除Reception", notes = "根据ID批量删除Reception")
	@ApiImplicitParam(name = "access-token", value = "用户登录秘钥", paramType = "header", required = true, dataType = "String")
	@RequestMapping(value = "/deleteByIds",method = RequestMethod.POST)
	public ModelAndView delete(String ids){
		ModelAndView modelAndView = new ModelAndView();
		String[] arr = ids.split(",");
		List<String> list = new ArrayList<String>();
		for(String str : arr){
			list.add(str);
		}
		service.deleteByIds(list);		
		return buildResponse(modelAndView);
	}
	
	
	/**
	 * 根据主键加载
	 * @param id
	 * @return
	 */
	@ApiOperation(value = "根据ID加载Reception", notes = "根据ID加载Reception")
	@ApiImplicitParam(name = "access-token", value = "用户登录秘钥", paramType = "header", required = true, dataType = "String")
	@RequestMapping(value = "/loadById",method = RequestMethod.POST)
	public ModelAndView  loadById(String id){
		ModelAndView modelAndView = new ModelAndView();
		return buildResponse(modelAndView, service.loadById(id));
	}
	
	
}
