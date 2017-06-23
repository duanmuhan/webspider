package com.cgs.spider.thread;

import com.cgs.spider.service.StockDataService;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/5/7.
 */
@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class RequestThread implements Runnable {

  private List<String> stockIdList;
  @Resource
  private StockDataService requestStockDataService;

  public void setStockIdList(List<String> stockIdList) {
    this.stockIdList = stockIdList;
  }

  @Override
  public void run() {
    try {
      while (true){
        requestStockDataService.requestStockData(stockIdList);
        Thread.sleep(10);
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

}
