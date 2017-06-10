package com.cgs.spider.service;

import com.cgs.spider.constant.Constant;
import com.cgs.spider.constant.RedisKeys;
import com.cgs.spider.dao.StockUrlDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Administrator on 2017/5/7.
 */
@Component
public class InitStockListService {

    @Value("url.sh")
    private String shUrl;
    @Value("url.sz")
    private String szUrl;

    @Autowired
    private SpiderCrawlerService spiderCrawlerService;
    @Autowired
    private StockUrlDao stockUrlDao;
    private Map<String,String> totalMap = new ConcurrentHashMap<>();

    public Map<String,String> getUrlMap(){
        try {
            Map<String,String> stockIdAndHrefMapSZ = spiderCrawlerService.getStockIdAndHrefMap(Constant.EXCHANGE_SHENZHEN_URL, Constant.EXCHANGE_SHENZHEN_FOR_SHORT);
            Map<String,String> stockIdAndHrefMapSH = spiderCrawlerService.getStockIdAndHrefMap(Constant.EXCHANGE_SHANGHAI_URL,Constant.EXCHANGE_SHANGHAI_FOR_SHORT);
            totalMap.putAll(stockIdAndHrefMapSZ);
            totalMap.putAll(stockIdAndHrefMapSH);
            for (String key : totalMap.keySet()){
                stockUrlDao.saveStockUrl(RedisKeys.urlKey(key),totalMap.get(key));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return totalMap;
    }

    public Map<String, String> getTotalMap() {
        if (totalMap.isEmpty()){
            totalMap = getUrlMap();
        }
        return totalMap;
    }
}
