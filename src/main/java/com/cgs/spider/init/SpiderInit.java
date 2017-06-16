package com.cgs.spider.init;


import com.cgs.spider.service.CompanyDetailService;
import com.cgs.spider.service.MarketValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by Administrator on 2017/5/7.
 */
@Component
public class SpiderInit {

    @Autowired
    private CompanyDetailService requestCompanyDetailService;
    @Autowired
    private MarketValueService marketValueService;

    @PostConstruct
    public void initCrawler(){
//        requestCompanyDetailService.requestBaseInfo();
        marketValueService.execute();
    }
}
