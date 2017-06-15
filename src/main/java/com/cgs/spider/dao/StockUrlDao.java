package com.cgs.spider.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

@Component
public class StockUrlDao {

  @Autowired
  private RedisTemplate<String,String> redisTemplate;

  public void saveStockUrl(String key,String value){
    if (!ObjectUtils.isEmpty(key) && !ObjectUtils.isEmpty(value)){
      redisTemplate.opsForValue().set(key,value);
    }
  }

  public List<String> getStockUrl(String key){
    List<String> stockLists = new ArrayList<>();
    redisTemplate.opsForValue().get(key);
    return stockLists;
  }
}
