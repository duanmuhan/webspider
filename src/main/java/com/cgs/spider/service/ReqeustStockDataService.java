package com.cgs.spider.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by Administrator on 2017/5/7.
 */
@Service
public class ReqeustStockDataService {

    @Autowired
    private InitStockListService initStockListService;

    public void requestStockData(){
        Map<String,String> stockMap = initStockListService.getTotalMap();
    }
}
