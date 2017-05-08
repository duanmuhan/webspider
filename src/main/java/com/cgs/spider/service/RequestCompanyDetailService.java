package com.cgs.spider.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by Administrator on 2017/5/8.
 */
@Service
public class RequestCompanyDetailService {

    @Autowired
    private InitStockListService initStockListService;
    @Autowired
    private SpiderCrawlerService spiderCrawlerService;

    public Map<String,String> requestCompanyInfo(){
        Map<String,String> stockIdMap = initStockListService.getUrlMap();
        Map<String,String> companyDetailMap = spiderCrawlerService.getStockDetailList(stockIdMap);
        return companyDetailMap;
    }
}
