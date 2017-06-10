package com.cgs.spider.service;

import com.cgs.spider.constant.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Administrator on 2017/6/9.
 */
@Service
public class MarketValueService {

    @Autowired
    private InitStockListService initStockListService;
    private ExecutorService executorService = Executors.newFixedThreadPool(Constant.THREAD_NUM);

    public void execute(){

    }

    public void submit(Runnable runnable){
        executorService.execute(runnable);
    }
}
