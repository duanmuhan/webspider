package com.cgs.spider.thread;

import com.cgs.spider.service.StockDataService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2017/5/7.
 */
public class RequestThread implements Runnable {

  private List<String> stockIdList;
  @Autowired
  private StockDataService requestStockDataService;

  public RequestThread(List<String> stockIdList){
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
