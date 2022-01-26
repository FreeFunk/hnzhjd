package com.edgedo.sys.controller;


import java.util.ArrayList;
import java.util.List;

import com.edgedo.common.base.BaseController;
import com.edgedo.sys.entity.*;
import com.edgedo.sys.queryvo.EventQuery;
import com.edgedo.sys.service.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Api(tags = "Event")
@Controller
@RequestMapping("/admin/event")
public class EventController extends BaseController{
	
	@Autowired
	private EventService service;
	@Autowired
	private CarArrangeService carArrangeService;
	@Autowired
	private MeetingRoomArrangeService meetingRoomArrangeService;
	@Autowired
	private RoomArrangeService roomArrangeService;
	@Autowired
	private RestaurantArrangeService restaurantArrangeService;
	@Autowired
	private PickupArrangeService pickupArrangeService;
	@Autowired
	private DefineArrangeService defineArrangeService;
	
	/**
	 * 分页查询
	 * @param query
	 * @return
	 */
	@ApiOperation(value = "分页查询Event", notes = "分页查询Event")
	@ApiImplicitParam(name = "access-token", value = "用户登录秘钥", paramType = "header", required = true, dataType = "String")
	@RequestMapping(value = "/listpage",method = RequestMethod.POST)
	public ModelAndView listpage(@ModelAttribute EventQuery query){
		ModelAndView modelAndView = new ModelAndView();
		service.listPage(query);
		buildResponse(modelAndView,query);
		return modelAndView;
	}
	

	/**
	 * 新增修改
	 * @param voObj
	 * @return
	 */
	@ApiOperation(value = "新增修改Event", notes = "新增修改Event")
	@ApiImplicitParam(name = "access-token", value = "用户登录秘钥", paramType = "header", required = true, dataType = "String")
	@RequestMapping(value = "/saveOrUpdate",method = RequestMethod.POST)
	public ModelAndView saveOrUpdate(Event voObj){
		ModelAndView modelAndView = new ModelAndView();
		String errMsg = "";
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
	@ApiOperation(value = "根据ID批量删除Event", notes = "根据ID批量删除Event")
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
	@ApiOperation(value = "根据ID加载Event", notes = "根据ID加载Event")
	@ApiImplicitParam(name = "access-token", value = "用户登录秘钥", paramType = "header", required = true, dataType = "String")
	@RequestMapping(value = "/loadById",method = RequestMethod.POST)
	public ModelAndView  loadById(String id){
		ModelAndView modelAndView = new ModelAndView();
		return buildResponse(modelAndView, service.loadById(id));
	}

	/**
	 * 根据事件查询相关信息数量
	 * @param eventId
	 * @return
	 */
	@ApiOperation(value = "查询该事件下面的其他信息", notes = "查询该事件下面的其他信息")
	@ApiImplicitParam(name = "access-token", value = "用户登录秘钥", paramType = "header", required = true, dataType = "String")
	@RequestMapping(value = "/detailCountByEventId",method = RequestMethod.POST)
	public ModelAndView  detailCountByEventId(int eventId){
		ModelAndView modelAndView = new ModelAndView();
		List<Integer> eventMngCount = new ArrayList<Integer>();
		//航班/乘车信息数量
		int pickUpArrangeCount = pickupArrangeService.selectCountByEventId(eventId);
		eventMngCount.add(pickUpArrangeCount);
		//车辆安排数量
		int carArrangeCount = carArrangeService.selectCountByEventId(eventId);
		eventMngCount.add(carArrangeCount);
		//会议室安排
		int mtRootArrangeCount = meetingRoomArrangeService.selectMtraCountByEventId(eventId);
		eventMngCount.add(mtRootArrangeCount);
		//房间安排
		int roomArrangeCount = roomArrangeService.selectRoomCountByEventId(eventId);
		eventMngCount.add(roomArrangeCount);
		//餐厅安排
		int resArrangeCount = restaurantArrangeService.selectResCountByEventId(eventId);
		eventMngCount.add(resArrangeCount);
		//自定义安排
		int defineArrangeCount = defineArrangeService.selectDefineCountByEventId(eventId);
		eventMngCount.add(defineArrangeCount);
		return buildResponse(modelAndView,eventMngCount);
	}
	
	
}
