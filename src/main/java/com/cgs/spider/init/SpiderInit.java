package com.cgs.spider.init;


import com.cgs.spider.service.RequestCompanyDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by Administrator on 2017/5/7.
 */
@Component
public class SpiderInit {

    @Autowired
    private RequestCompanyDetailService requestCompanyDetailService;

    @PostConstruct
    public void initCrawler(){
        requestCompanyDetailService.requestBaseInfo();
    }
}
