package com.cgs.spider.service;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;

/**
 * Created by Administrator on 2017/5/7.
 */
@Service
public class ReqeustStockDataService {

    @Value("sina_prefix")
    private String prefix;

    @Autowired
    private InitStockListService initStockListService;
    private CloseableHttpClient httpClient = HttpClients.createDefault();

    public void requestStockData(){
        Map<String,String> stockMap = initStockListService.getTotalMap();
        try {
            for (String key : stockMap.keySet()){
                String content = requestUrl(stockMap.get(key));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private String requestUrl(String url) throws IOException {
        HttpGet httpGet = new HttpGet(url);
        CloseableHttpResponse response = httpClient.execute(httpGet);
        HttpEntity entity = response.getEntity();
        return EntityUtils.toString(entity,"gb2312");
    }
}
