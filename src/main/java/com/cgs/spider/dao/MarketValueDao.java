package com.cgs.spider.dao;

import com.cgs.spider.constant.RedisKeys;
import com.cgs.spider.entity.MarketValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * Created by Administrator on 2017/5/30.
 */
public class MarketValueDao {

  @Autowired
  private RedisTemplate<String,String> redisTemplate;

  public void saveMarketValue(String stockId,MarketValue marketValue){
    redisTemplate.opsForValue().set(RedisKeys.marketValueKey(stockId),marketValue.toString());
  }
}
