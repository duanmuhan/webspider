package com.cgs.spider.service;

import com.cgs.spider.dao.CompanyDao;
import com.cgs.spider.entity.CompanyBase;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/5/8.
 */
@Component
public class CompanyDetailService {

    @Autowired
    private InitStockListService initStockListService;
    @Autowired
    private SpiderCrawlerService spiderCrawlerService;
    @Autowired
    private CompanyDao companyDao;

    public void requestBaseInfo(){
        Map<String,List<CompanyBase>> companyMap = requestCompanyInfo();
        companyDao.saveCompanyInfo(companyMap);
    }

    private Map<String,List<CompanyBase>> requestCompanyInfo(){
        Map<String,String> stockIdMap = initStockListService.getUrlMap();
        Map<String,List<CompanyBase>> companyDetailMap = new HashMap<>();
        try {
            companyDetailMap = spiderCrawlerService.getCompanyDetailList(stockIdMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return companyDetailMap;
    }
}
