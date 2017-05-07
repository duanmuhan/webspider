package com.cgs.spider.service;

import com.cgs.spider.constant.Constant;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SpiderCrawlerService {

    private  CloseableHttpClient httpClient = HttpClients.createDefault();

    private String requestUrl(String url) throws IOException {
        HttpGet httpGet = new HttpGet(url);
        CloseableHttpResponse response = httpClient.execute(httpGet);
        HttpEntity entity = response.getEntity();
        return EntityUtils.toString(entity,"gb2312");
    }

    public Map<String,String> getStockIdAndHrefMap(String url,String exchangeForShort) throws IOException {
        Map<String,String> stockIdAndHrefMap = new HashMap<>();
        String response = requestUrl(url);
        if (!StringUtils.isEmpty(response)){
            stockIdAndHrefMap = parseStockIdList(response,exchangeForShort);
        }
        return stockIdAndHrefMap;
    }

    public Map<String,String> getStockDetailList(List<String> stockIds){
        Map<String,String> stockDetailMap = new HashMap<>();

        return stockDetailMap;
    }

    private Map<String,String> parseStockIdList(String content,String exchangeForShort){
        Map<String,String> stockIdAndHrefMap = new HashMap<>();
        Document document = Jsoup.parse(content);
        Elements elements = document.getElementsByTag("li");
        for (Element element : elements){
            if (element.toString().contains(exchangeForShort)){
                String href = element.select("a").attr("href");
                String[] strArray = href.split("/|.html");
                stockIdAndHrefMap.put(strArray[4].replace(exchangeForShort,""),href);
            }

        }
        return stockIdAndHrefMap;
    }

    public static void main(String[] args) {
        String url = "http://quote.eastmoney.com/stocklist.html#sh";
        SpiderCrawlerService spiderCrawlerService = new SpiderCrawlerService();
        try {
            spiderCrawlerService.getStockIdAndHrefMap(url,Constant.EXCHANGE_SHENZHEN_FOR_SHORT);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
