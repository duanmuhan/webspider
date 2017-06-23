package com.cgs.spider.message;

import org.springframework.stereotype.Component;

@Component
public class AMQPClient {

//  @Autowired
//  private JmsTemplate jmsTemplate;
//
//  public void sendMessage(String queueName,String message){
//    MessageCreator messageCreator = session -> {
//      TextMessage textMessage = session.createTextMessage(message);
//      return textMessage;
//    };
//    jmsTemplate.send(queueName,messageCreator);
//  }

}
