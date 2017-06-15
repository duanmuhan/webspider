package com.cgs.spider.service;

import com.cgs.spider.constant.Constant;
import com.cgs.spider.thread.RequestThread;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/6/9.
 */
@Service
public class MarketValueService {

    @Autowired
    private InitStockListService initStockListService;
    private ExecutorService executorService = Executors.newFixedThreadPool(Constant.THREAD_NUM);

    public void execute(){
        List<String> stockList = initStockListService.getStockList();
        int length = stockList.size();
        int step = length / Constant.THREAD_NUM;
        for (int beginIndex = 0; beginIndex<length; beginIndex = beginIndex + step){
            int endIndex = beginIndex + step;
            List<String> subList;
            if (endIndex >= stockList.size()){
                subList = stockList.subList(beginIndex,stockList.size() - 1);
            }else {
                subList = stockList.subList(beginIndex,endIndex);
            }
            RequestThread requestThread = new RequestThread(subList);
            submit(requestThread);
        }

    }

    public void submit(Runnable runnable){
        executorService.execute(runnable);
    }

}
