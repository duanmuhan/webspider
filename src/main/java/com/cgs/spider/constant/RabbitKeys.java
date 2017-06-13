package com.cgs.spider.constant;

public enum RabbitKeys {

    MARKET_VALUE("trendMin");

    private String context;

    RabbitKeys(String context) {
        this.context = context;
    }

    public String getContext() {
        return context;
    }
}
