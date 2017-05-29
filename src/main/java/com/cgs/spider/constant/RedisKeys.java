package com.cgs.spider.constant;

/**
 * Created by Administrator on 2017/5/15.
 */
public class RedisKeys {

    private static String redisPrefix="spider:quotes:company:";

    public static String key(String stockId){
        return redisPrefix + stockId;
    }
}
