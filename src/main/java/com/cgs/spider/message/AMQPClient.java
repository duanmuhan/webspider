package com.cgs.spider.message;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.jms.TextMessage;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class AMQPClient {

  @Resource
  private JmsTemplate jmsTemplate;

  public void sendMessage(String queueName,String message){
    MessageCreator messageCreator = session -> {
      TextMessage textMessage = session.createTextMessage(message);
      return textMessage;
    };
    jmsTemplate.send(queueName,messageCreator);
  }

}
