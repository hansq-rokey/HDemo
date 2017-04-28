package com.hansq.demo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hansq.demo.util.SmsUtils;
import com.shcm.bean.SendResultBean;

/**
 * @description 短信发送
 * @author hansq
 * @create 2017-3-27 下午3:35:40
 */
@Service
public class MessageDemoServiceImpl implements MessageDemoService {
	@Resource
	private SmsUtils smsUtils;
	@Override
	public void messageHandler(String message) {
		List<SendResultBean> results = smsUtils.sendOnce("17682342705",message);
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
