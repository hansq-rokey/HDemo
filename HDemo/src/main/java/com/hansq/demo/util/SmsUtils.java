package com.hansq.demo.util;

import java.util.List;

import org.springframework.stereotype.Component;

import com.shcm.bean.SendResultBean;
import com.shcm.send.DataApi;
import com.shcm.send.OpenApi;

@Component
public class SmsUtils {

	static String openurl="http://smsapi.c123.cn/OpenPlatform/OpenApi";
	static String dataUrl="http://smsapi.c123.cn/DataPlatform/DataApi";
	static String account="1001@501127680001";
	static String authkey="B51ECD11D0D2E553791FF4DA5BB9EDFD";
	static int cgid=3976;
	static int csid=4958;
	
	public List<SendResultBean> sendOnce(String mobile, String content) {
		// 发送参数
		OpenApi.initialzeAccount(openurl, account, authkey, cgid,csid);

		// 状态及回复参数
		DataApi.initialzeAccount(dataUrl, account,authkey);
		// 发送短信
		List<SendResultBean> listItem = OpenApi.sendOnce(mobile, content, 0, 0, null);
		return listItem;
	}
	
//	public static void main(String[] args) {
////		sendOnce("13750886866", "温控器时间戳有50个出现问题，请登录CMS系统进行处理！");//18656990587
//		sendOnce("17682342705", "1234为您的白熊注册验证码。如非本人操作，请忽略");//18656990587
//	}
}
