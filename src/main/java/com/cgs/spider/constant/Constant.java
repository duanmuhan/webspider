package com.cgs.spider.constant;

/**
 * Created by Administrator on 2017/5/7.
 */
public interface Constant {
    String EXCHANGE_SHENZHEN_FOR_SHORT = "sz";
    String EXCHANGE_SHANGHAI_FOR_SHORT = "sh";
    String CHUANGYE_PREFIX = "300";
    String A_BOARD_PREFIX = "60";
    String B_BOARD_PREFIX = "900";
    String SME_BOARD = "002";
    String NEW_STOCK_BOARD = "730";
    String EXCHANGE_SHANGHAI_URL="http://quote.eastmoney.com/stocklist.html#sh";
    String EXCHANGE_SHENZHEN_URL="http://quote.eastmoney.com/stocklist.html#sz";
    String COMPANY_BAOBIAO_URL_PREFIX ="http://stockpage.10jqka.com.cn/";
    String COMPANY_BAOBIAO_URL_POSTFIX ="/finance/#finance";
    String MARKET_VALUE_URL = "http://hq.sinajs.cn/list=";

    int THREAD_NUM = 9;
}
