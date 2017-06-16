package com.cgs.spider.thread;

import com.cgs.spider.service.StockDataService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/5/7.
 */
@Component
@Scope("prototype")
public class RequestThread implements Runnable {

  private List<String> stockIdList;

  @Autowired
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
