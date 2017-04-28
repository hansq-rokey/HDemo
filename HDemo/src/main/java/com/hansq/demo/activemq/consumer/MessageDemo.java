package com.hansq.demo.activemq.consumer;

import javax.annotation.Resource;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.springframework.stereotype.Component;

import com.hansq.demo.service.MessageDemoService;

@Component
public class MessageDemo implements MessageListener{
	@Resource
	private MessageDemoService demoService;
	@Override
	public void onMessage(Message message) {
		try {
			String msg = ((TextMessage)message).getText();
			demoService.messageHandler(msg);
			System.out.println("queue.message接受的消息："+msg);
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}

}
