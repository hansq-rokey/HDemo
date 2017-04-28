/**
 * ibaixiong.com Inc.
 * Copyright (c) 2015-2016 All Rights Reserved.
 */
package com.hansq.demo.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.hansq.demo.activemq.SendMessageProducer;
import com.hansq.demo.entity.SsssCityMerchant;
import com.hansq.demo.service.SsssCityMerchantService;
import com.hansq.demo.util.SmsUtils;
import com.shcm.bean.SendResultBean;

@Controller
public class SsssCityMerchantAction {
	@Resource
	private SsssCityMerchantService cityService;
	@Resource
	private SendMessageProducer sendMessageProducer;
	@Resource
	private SmsUtils smsUtils;
	
	@RequestMapping("/list")
	public String cityMerchant(
			Model model,@RequestParam(value="pageNo",defaultValue="1")Integer pageNo) {
		List<SsssCityMerchant> citys = cityService.getList(pageNo);
		PageInfo<SsssCityMerchant> pageInfo = new PageInfo<SsssCityMerchant>(citys);
		model.addAttribute("pageInfo", pageInfo);
		model.addAttribute("citys", citys);
		//短信接口
//		sendMessageProducer.send("queue.message", "hansq测试信息!");
		return "list";
	}
	
	/**
	 * @Description:短信验证码测试
	 * @param request
	 * @param code void
	 * @author hansq
	 * @date 2017-4-28 下午5:09:34
	 */
	@RequestMapping("/send")
	public void sendMessage(HttpServletRequest request,String code){
		HttpSession session = request.getSession();
		session.setAttribute("code", code);
		session.setMaxInactiveInterval(60*5);
		List<SendResultBean> results = smsUtils.sendOnce("17682342705","【白熊科技】熊爸爸申请加盟系统验证码: "+code+", 有效时间: 5分钟");
		for(SendResultBean result:results){
			System.out.println(
					result.getResult()+","+
					result.getCorpId()+","+
					result.getErrMsg()+","+
					result.getMsgId()+","+
					result.getRemain()+","+result.getTotal());
		}
	}
}




