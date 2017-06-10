package com.cgs.spider.constant;

/**
 * Created by Administrator on 2017/5/15.
 */
public class RedisKeys {

    private static String redisPrefix="spider:quotes:company:";
    private static String redisUrlPrefix = "spider:quotes:url:";

    public static String key(String stockId){
        return redisPrefix + stockId;
    }
    public static String urlKey(String stockId) {return redisUrlPrefix + stockId;}
}
