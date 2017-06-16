package com.cgs.spider.service.cache;

import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Administrator on 2017/6/12.
 */
@Component
public class MarketValueCache {

    private Map<String,String> cache = new ConcurrentHashMap<>();

    public boolean putOrBack(String key,String value){
        if (ObjectUtils.isEmpty(cache.get(key)) || !cache.get(key).equals(value)){
            cache.put(key,value);
            return true;
        }
        if (cache.get(key).equals(value)){
            return false;
        }
        return true;
    }
}
