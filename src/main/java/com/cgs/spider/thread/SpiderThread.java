package com.cgs.spider.thread;

import com.cgs.spider.service.SpiderCrawlerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/5/7.
 */
@Component
public class SpiderThread extends Thread {

    @Autowired
    SpiderCrawlerService spiderCrawlerService;

    @Override
    public void run() {

    }
}

