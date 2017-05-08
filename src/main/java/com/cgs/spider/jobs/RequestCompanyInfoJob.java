package com.cgs.spider.jobs;

import com.cgs.spider.service.RequestCompanyDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/5/9.
 */
@Service
public class RequestCompanyInfoJob {

    @Autowired
    private RequestCompanyDetailService requestCompanyDetailService;

}

