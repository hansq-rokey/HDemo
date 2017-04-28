package com.hansq.demo.activemq;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

@Component
public class SendMessageProducer {
	@Autowired
	@Qualifier("jmsQueueTemplate")
	private JmsTemplate jmsTemplate;
	
	/**
	 * 发送一条订单编号消息到指定的队列（目标）
	 * @param queueName 队列名称
	 * @param message 消息内容
	 */
	public void send(String queueName,final String message){
		System.out.println("----"+message);
		jmsTemplate.send(queueName, new MessageCreator(){
			@Override
			public Message createMessage(Session session) throws JMSException {
				// TODO Auto-generated method stub
				return session.createTextMessage(message);
			}
			
		});
	}
}
