package com.cgs.spider.service;

import com.cgs.spider.constant.Constant;
import com.cgs.spider.dao.CompanyDao;
import com.cgs.spider.vo.CompanyBaseVO;
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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class SpiderCrawlerService {

    private  CloseableHttpClient httpClient = HttpClients.createDefault();

    @Autowired
    private CompanyDao dao;

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

    public Map<String,String> getCompanyDetailList(Map<String,String> stockMap) throws IOException, InterruptedException {
        Map<String,String> companyDetailMap = new HashMap<>();
        for (String key : stockMap.keySet()){
            String url = Constant. COMPANY_BAOBIAO_URL_PREFIX + key + Constant.COMPANY_BAOBIAO_URL_POSTFIX;
            HttpGet httpGet = new HttpGet(url);
            CloseableHttpResponse response = httpClient.execute(httpGet);
            String companyDetailValue = parseCompanyDetailList(key,EntityUtils.toString(response.getEntity(),"gb2312"));
            companyDetailMap.put(key,companyDetailValue);
            Thread.sleep(1000);
        }
        return companyDetailMap;
    }

    private Map<String,String> parseStockIdList(String content,String exchangeForShort){
        Map<String,String> stockIdAndHrefMap = new HashMap<>();
        Document document = Jsoup.parse(content);
        Elements elements = document.getElementsByTag("li");
        for (Element element : elements){
            if (element.toString().contains(exchangeForShort)){
                String href = element.select("a").attr("href");
                String[] strArray = href.split("/|.html");
                for (int i=0; i<strArray.length; i++){
                    if (strArray[i].contains(exchangeForShort)){
                        stockIdAndHrefMap.put(strArray[i].replace(exchangeForShort,""),href);
                    }
                }
            }
        }
        return stockIdAndHrefMap;
    }

    private String parseCompanyDetailList(String key,String content){
        StringBuilder sb = new StringBuilder();
        List<CompanyBaseVO> companyBaseVOList = new ArrayList<>();
        if (!ObjectUtils.isEmpty(content)){
            Document document = Jsoup.parse(content);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String url = "http://quote.eastmoney.com/stocklist.html#sh";
        SpiderCrawlerService spiderCrawlerService = new SpiderCrawlerService();
        try {
            Map<String,String> urlMap = spiderCrawlerService.getStockIdAndHrefMap(url,Constant.EXCHANGE_SHENZHEN_FOR_SHORT);
            spiderCrawlerService.getCompanyDetailList(urlMap);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
