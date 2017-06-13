package com.cgs.spider.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import javax.jms.TextMessage;

@Component
public class AMQPClient {

  @Autowired
  private JmsTemplate jmsTemplate;

  public void sendMessage(String queueName,String message){
    MessageCreator messageCreator = session -> {
      TextMessage textMessage = session.createTextMessage(message);
      return textMessage;
    };
    jmsTemplate.send(queueName,messageCreator);
  }

}
