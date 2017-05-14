package com.cgs.spider.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/5/8.
 */
@Component
public class RequestCompanyDetailService {

    @Autowired
    private InitStockListService initStockListService;
    @Autowired
    private SpiderCrawlerService spiderCrawlerService;

    public Map<String,String> requestCompanyInfo(){
        Map<String,String> stockIdMap = initStockListService.getUrlMap();
        Map<String,String> companyDetailMap = new HashMap<>();
        try {
            companyDetailMap = spiderCrawlerService.getCompanyDetailList(stockIdMap);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return companyDetailMap;
    }
}
