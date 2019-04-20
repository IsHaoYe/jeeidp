package com.idp.web.buyers.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idp.common.base.BaseController;
import com.idp.common.constant.SysMessage;
import com.idp.common.model.JsonModel;
import com.idp.common.model.PageModel;
import com.idp.common.util.ValidateUtil;
import com.idp.biz.buyers.entity.AjrBuyers;
import com.idp.biz.buyers.service.AjrBuyersService;

 /**
 * 客户留言管理controller
 * 
 * @author King 2019-04-19
 *
 */
@Controller
@RequestMapping("/ajrBuyers/")
public class AjrBuyersController extends BaseController {

	private static Logger logger = LoggerFactory.getLogger(AjrBuyersController.class);

	@Autowired
	private AjrBuyersService ajrBuyersService;
	
	/**
	 * 初始化查询页面
	 * Taowd 2019-04-19
	 * @return
	 */
	@RequestMapping(value="init",method=RequestMethod.GET)
	public String init(){
		
		logger.info("客户留言管理");
		
		return "buyers/ajrBuyers/ajrBuyersList";
	}
	
	/**
	 * 分页查询
	 * Taowd 2019-04-19
	 * @param ajrBuyers
	 * @param page
	 * @return
	 */
	@RequestMapping(value="list",method=RequestMethod.POST)
	@ResponseBody
	public PageModel<AjrBuyers> list(AjrBuyers ajrBuyers,PageModel<AjrBuyers> page){
		
		return ajrBuyersService.findByPage(ajrBuyers, page);
	}

	/**
	 * 新增修改页面初始化
	 * Taowd 2019-04-19
	 * @param id
	 * @param request
	 * @return
	 */
	@RequestMapping(value="ajrBuyers",method=RequestMethod.GET)
	public String ajrBuyers(String id,HttpServletRequest request){
		
		if(ValidateUtil.isNotEmpty(id)){
			
			AjrBuyers ajrBuyers = ajrBuyersService.getById(id);
			request.setAttribute("ajrBuyers", ajrBuyers);
		}
		
		return "buyers/ajrBuyers/ajrBuyersEdit";
	}
	
	/**
	 * 检视
	 * Taowd 2019-04-19
	 * @param id
	 * @param request
	 * @return
	 */
	@RequestMapping(value="view",method=RequestMethod.GET)
	public String view(String id,HttpServletRequest request){
		
		if(ValidateUtil.isNotEmpty(id)){
				
			AjrBuyers ajrBuyers = ajrBuyersService.getById(id);
			request.setAttribute("ajrBuyers", ajrBuyers);
		}
	
		return "buyers/ajrBuyers/ajrBuyersView";
	}
	
	/**
	 * 保存
	 * Taowd 2019-04-19
	 * @param ajrBuyers
	 * @return
	 */
	@RequestMapping(value="save",method=RequestMethod.POST)
	@ResponseBody
	public JsonModel save(AjrBuyers ajrBuyers){
		
		JsonModel json = new JsonModel();
		
		// 修改
		if(ValidateUtil.isNotEmpty(ajrBuyers.getId())){
			
			ajrBuyersService.update(ajrBuyers);
			json.setMessage(SysMessage.COMMON_UPDATE_SUCCESS);
		}
		// 新增
		else{
			
			ajrBuyersService.add(ajrBuyers);
			json.setMessage(SysMessage.COMMON_ADD_SUCCESS);
		}
		
		return json;
	}
	
	/**
	 * 删除
	 * Taowd 2019-04-19
	 * @param id
	 * @return
	 */
	@RequestMapping(value="delete",method=RequestMethod.POST)
	@ResponseBody
	public JsonModel delete(String ids){
		
		JsonModel json = new JsonModel();
		
		ajrBuyersService.delete(ids);
		json.setMessage(SysMessage.COMMON_DELETE_SUCCESS);
		
		return json;
	}
}
