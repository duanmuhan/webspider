package com.cgs.spider.service;

import com.cgs.spider.constant.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Administrator on 2017/5/7.
 */
@Service
public class InitStockListService {

    @Value("sh")
    private String shUrl;
    @Value("sz")
    private String szUrl;

    @Autowired
    private SpiderCrawlerService spiderCrawlerService;
    private Map<String,String> totalMap = new ConcurrentHashMap<>();

    public Map<String,String> getUrlMap(){
        try {
            Map<String,String> stockIdAndHrefMapSZ = spiderCrawlerService.getStockIdAndHrefMap(szUrl, Constant.EXCHANGE_SHENZHEN_FOR_SHORT);
            Map<String,String> stockIdAndHrefMapSH = spiderCrawlerService.getStockIdAndHrefMap(shUrl,Constant.EXCHANGE_SHANGHAI_FOR_SHORT);
            totalMap.putAll(stockIdAndHrefMapSZ);
            totalMap.putAll(stockIdAndHrefMapSH);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return totalMap;
    }

    public Map<String, String> getTotalMap() {
        return totalMap;
    }
}
