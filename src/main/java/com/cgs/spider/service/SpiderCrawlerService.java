package com.cgs.spider.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.cgs.spider.constant.Constant;
import com.cgs.spider.constant.WebAttributeConstant;
import com.cgs.spider.entity.CompanyBase;
import com.cgs.spider.vo.CompanyBaseVO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private Logger logger = LoggerFactory.getLogger(SpiderCrawlerService.class);
    private  CloseableHttpClient httpClient = HttpClients.createDefault();
    private ThreadLocal<SimpleDateFormat> threadLocal = new ThreadLocal();

    private String requestUrl(String url) throws IOException {
        HttpGet httpGet = new HttpGet(url);
        CloseableHttpResponse response = httpClient.execute(httpGet);
        HttpEntity entity = response.getEntity();
        return EntityUtils.toString(entity,WebAttributeConstant.COMPANY_PAGE_ENCODE);
    }

    public Map<String,String> getStockIdAndHrefMap(String url,String exchangeForShort) throws IOException {
        Map<String,String> stockIdAndHrefMap = new HashMap<>();
        String response = requestUrl(url);
        if (!StringUtils.isEmpty(response)){
            stockIdAndHrefMap = parseStockIdList(response,exchangeForShort);
        }
        return stockIdAndHrefMap;
    }

    public Map<String,List<CompanyBase>> getCompanyDetailList(Map<String,String> stockMap)
        throws IOException, InterruptedException, ParseException {
        Map<String,List<CompanyBase>> companyDetailMap = new HashMap<>();
        for (String key : stockMap.keySet()){
            String url = Constant. COMPANY_BAOBIAO_URL_PREFIX + key + Constant.COMPANY_BAOBIAO_URL_POSTFIX;
            HttpGet httpGet = new HttpGet(url);
            CloseableHttpResponse response = httpClient.execute(httpGet);
            List<CompanyBase> companyBaseList = parseCompanyDetailList(key,EntityUtils.toString(response.getEntity(),"gb2312"));
            companyDetailMap.put(key,companyBaseList);
            Thread.sleep(20);
        }
        return companyDetailMap;
    }

    private Map<String,String> parseStockIdList(String content,String exchangeForShort){
        Map<String,String> stockIdAndHrefMap = new HashMap<>();
        Document document = Jsoup.parse(content);
        Elements elements = document.getElementsByTag(WebAttributeConstant.STOCKPAGE_LI);
        for (Element element : elements){
            if (element.toString().contains(exchangeForShort)){
                String href = element.select("a").attr(WebAttributeConstant.STOCKPAGE_HREF);
                String[] strArray = href.split("/|.html");
                for (int i=0; i<strArray.length; i++){
                    if (strArray[i].contains(exchangeForShort)){
                        stockIdAndHrefMap.put(strArray[i],href);
                    }
                }
            }
        }
        return stockIdAndHrefMap;
    }

    private List<CompanyBase> parseCompanyDetailList(String key, String content)
        throws ParseException {
        List<CompanyBase> companyBaseVOList = new ArrayList<>();
        if (!ObjectUtils.isEmpty(content)){
            Document document = Jsoup.parse(content);
            SimpleDateFormat simpleDateFormat = getSimpleDateFormat();
            if (document.getElementById(WebAttributeConstant.COMPANY_BASE_ID) != null &&
                    document.getElementById(WebAttributeConstant.COMPANY_MAIN) != null){
                String mainContent = document.getElementById(WebAttributeConstant.COMPANY_MAIN).text();
                Map<String,JSONArray> mainMap = (Map)JSONObject.parse(mainContent);
                JSONArray jsonArray = mainMap.get("report");
                //TODO 这个需要考虑下数组的长度
                if (jsonArray.size() == 19 || jsonArray.size() == 17){
                    List<String> dateList = ((JSONArray)jsonArray.get(0)).toJavaList(String.class);
                    List<String> perShareEarningsList = ((JSONArray)jsonArray.get(1)).toJavaList(String.class);
                    List<String> retainedProfitsList = ((JSONArray)jsonArray.get(2)).toJavaList(String.class);
                    List<String> increaseInRetainedProfitsList = ((JSONArray)jsonArray.get(3)).toJavaList(String.class);
                    List<String> increaseInNetProfitList = ((JSONArray)jsonArray.get(4)).toJavaList(String.class);
                    List<String> nonNetProfitDeductionList = ((JSONArray)jsonArray.get(5)).toJavaList(String.class);
                    List<String> increaseInNonNetProfitDeductionList = ((JSONArray)jsonArray.get(6)).toJavaList(String.class);
                    List<String> grossRevenueList = ((JSONArray)jsonArray.get(7)).toJavaList(String.class);
                    List<String> yearOnYearGrowthRateOfTotalRevenueList = ((JSONArray)jsonArray.get(8)).toJavaList(String.class);
                    List<String> netAssertValuePerShareList = ((JSONArray)jsonArray.get(9)).toJavaList(String.class);
                    List<String> rateOfReturnOnCommonStockholdersList = ((JSONArray)jsonArray.get(10)).toJavaList(String.class);
                    List<String> netAssertYieldDilutedList = ((JSONArray)jsonArray.get(11)).toJavaList(String.class);
                    List<String> capitalReversePerShareList = ((JSONArray)jsonArray.get(12)).toJavaList(String.class);
                    List<String> operationCashFlowPerShareList = ((JSONArray)jsonArray.get(13)).toJavaList(String.class);
                    List<String> grossProfitMarginList = ((JSONArray)jsonArray.get(14)).toJavaList(String.class);
                    List<String> inventoryTurnoverRatioList = ((JSONArray)jsonArray.get(15)).toJavaList(String.class);
                    List<String> netProfitMarginOnSalesList = ((JSONArray)jsonArray.get(16)).toJavaList(String.class);
                    for (int i=0; i<dateList.size(); i++){
                        CompanyBaseVO companyBaseVO = new CompanyBaseVO();
                        companyBaseVO.setStockId(key);
                        companyBaseVO.setDate(simpleDateFormat.parse(dateList.get(i)));
                        companyBaseVO.setPerShareEarnings(perShareEarningsList.get(i));
                        companyBaseVO.setRetainedProfits(retainedProfitsList.get(i));
                        companyBaseVO.setIncreaseInRetainedProfits(increaseInRetainedProfitsList.get(i));
                        companyBaseVO.setIncreaseInNetProfit(increaseInNetProfitList.get(i));
                        companyBaseVO.setNonNetProfitDeduction(nonNetProfitDeductionList.get(i));
                        companyBaseVO.setIncreaseInNonNetProfitDeduction(increaseInNonNetProfitDeductionList.get(i));
                        companyBaseVO.setGrossRevenue(grossRevenueList.get(i));
                        companyBaseVO.setYearOnYearGrowthRateOfTotalRevenue(yearOnYearGrowthRateOfTotalRevenueList.get(i));
                        companyBaseVO.setNetAssertValuePerShare(netAssertValuePerShareList.get(i));
                        companyBaseVO.setRateOfReturnOnCommonStockholders(rateOfReturnOnCommonStockholdersList.get(i));
                        companyBaseVO.setNetAssertYieldDiluted(netAssertYieldDilutedList.get(i));
                        companyBaseVO.setCapitalReversePerShare(capitalReversePerShareList.get(i));
                        companyBaseVO.setOperationCashFlowPerShare(operationCashFlowPerShareList.get(i));
                        companyBaseVO.setGrossProfitMargin(grossProfitMarginList.get(i));
                        companyBaseVO.setInventoryTurnoverRatio(inventoryTurnoverRatioList.get(i));
                        companyBaseVO.setNetProfitMarginOnSales(netProfitMarginOnSalesList.get(i));
                        companyBaseVOList.add(companyBaseVO.toCompanyBase());
                    }
                }

            }
        }
        return companyBaseVOList;
    }

    private SimpleDateFormat getSimpleDateFormat(){
        if (threadLocal.get() != null){
            return threadLocal.get();
        }else {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            threadLocal.set(simpleDateFormat);
            return simpleDateFormat;
        }
    }
}
