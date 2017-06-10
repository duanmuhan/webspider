package com.cgs.spider.service;

import com.alibaba.fastjson.JSONObject;
import com.cgs.spider.constant.WebAttributeConstant;
import com.cgs.spider.entity.MarketValue;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/5/7.
 */
@Component
public class RequestStockDataService {

    @Value("sina_prefix")
    private String prefix;

    @Autowired
    private InitStockListService initStockListService;
    private CloseableHttpClient httpClient = HttpClients.createDefault();

    public void requestStockData(List<String> stockIdList){
        Map<String,String> stockMap = initStockListService.getTotalMap();
        try {
            for (String stockId : stockIdList){
                String content = requestUrl(stockMap.get(stockId));
                parseMarketValue(content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String requestUrl(String url) throws IOException {
        HttpGet httpGet = new HttpGet(url);
        CloseableHttpResponse response = httpClient.execute(httpGet);
        HttpEntity entity = response.getEntity();
        return EntityUtils.toString(entity, WebAttributeConstant.COMPANY_PAGE_ENCODE);
    }

    private MarketValue parseMarketValue(String content){
        MarketValue marketValue = new MarketValue();
        if (!ObjectUtils.isEmpty(content)){
            marketValue = (MarketValue)JSONObject.parse(content);
        }
        return marketValue;
    }
}
