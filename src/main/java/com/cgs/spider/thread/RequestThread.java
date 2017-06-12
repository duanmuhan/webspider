package com.cgs.spider.thread;

import com.cgs.spider.constant.Constant;
import com.cgs.spider.dao.MarketValueDao;
import com.cgs.spider.entity.MarketValue;
import com.cgs.spider.message.AMQPClient;
import java.util.List;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * Created by Administrator on 2017/5/7.
 */
public class RequestThread implements Runnable {

  private List<String> stockIdList;
  private CloseableHttpClient httpClient = HttpClients.createDefault();
  @Autowired
  private MarketValueDao marketValueDao;
  @Autowired
  private AMQPClient amqpClient;
  @Autowired
  private RedisTemplate<String,String> redisTemplate;

  public RequestThread(List<String> stockIdList){
    this.stockIdList = stockIdList;
  }

  @Override
  public void run() {
    try {
      for (String stockId : stockIdList){
        String url = Constant.COMPANY_BAOBIAO_URL_PREFIX + stockId;
        HttpGet httpGet = new HttpGet(url);
        CloseableHttpResponse response = httpClient.execute(httpGet);
        String content = EntityUtils.toString(response.getEntity());
        MarketValue marketValue = parseMarketValue(content);
        persistent(marketValue);
      }
      Thread.sleep(10);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  private MarketValue parseMarketValue(String content){
    MarketValue marketValue = new MarketValue();
    return marketValue;
  }

  private void persistent(MarketValue marketValue){

  }
}
