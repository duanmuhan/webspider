package com.cgs.spider.message;

import javax.print.attribute.standard.Destination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class AMQPClient {

  @Autowired
  private JmsTemplate jmsTemplate;
  @Autowired
  private Destination destination;

  public void sendMessage(String message){
  }

}
