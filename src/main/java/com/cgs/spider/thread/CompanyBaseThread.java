package com.cgs.spider.thread;

import com.cgs.spider.service.CompanyDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CompanyBaseThread implements Runnable {

  @Autowired
  private CompanyDetailService companyDetailService;

  @Override
  public void run() {

  }
}
