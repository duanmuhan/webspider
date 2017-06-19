package com.cgs.spider.vo;

import com.cgs.spider.entity.MarketValue;
import java.util.Date;

/**
 * Created by Administrator on 2017/5/29.
 */
public class MarketValueVO {

    private String stockId;
    private String stockName;
    private String open;
    private String preClose;
    private String current;
    private String highest;
    private String lowest;
    private String bidOne;
    private String bidSellOne;
    private String settlement;
    private String settlementAmount;
    private String buyOne;
    private String buyOneAmount;
    private String buyTwo;
    private String buyTwoAmount;
    private String buyThree;
    private String buyThreeAmount;
    private String buyFour;
    private String buyFourAmount;
    private String buyFive;
    private String buyFiveAmount;
    private String sellOne;
    private String sellOneAmount;
    private String sellTwo;
    private String sellTwoAmount;
    private String sellThree;
    private String sellThreeAmount;
    private String sellFour;
    private String sellFourAmount;
    Date time;

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName.substring(21,stockName.length());
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getPreClose() {
        return preClose;
    }

    public void setPreClose(String preClose) {
        this.preClose = preClose;
    }

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }

    public String getHighest() {
        return highest;
    }

    public void setHighest(String highest) {
        this.highest = highest;
    }

    public String getLowest() {
        return lowest;
    }

    public void setLowest(String lowest) {
        this.lowest = lowest;
    }

    public String getBidOne() {
        return bidOne;
    }

    public void setBidOne(String bidOne) {
        this.bidOne = bidOne;
    }

    public String getBidSellOne() {
        return bidSellOne;
    }

    public void setBidSellOne(String bidSellOne) {
        this.bidSellOne = bidSellOne;
    }

    public String getSettlement() {
        return settlement;
    }

    public void setSettlement(String settlement) {
        this.settlement = settlement;
    }

    public String getSettlementAmount() {
        return settlementAmount;
    }

    public void setSettlementAmount(String settlementAmount) {
        this.settlementAmount = settlementAmount;
    }

    public String getBuyOne() {
        return buyOne;
    }

    public void setBuyOne(String buyOne) {
        this.buyOne = buyOne;
    }

    public String getBuyOneAmount() {
        return buyOneAmount;
    }

    public void setBuyOneAmount(String buyOneAmount) {
        this.buyOneAmount = buyOneAmount;
    }

    public String getBuyTwo() {
        return buyTwo;
    }

    public void setBuyTwo(String buyTwo) {
        this.buyTwo = buyTwo;
    }

    public String getBuyTwoAmount() {
        return buyTwoAmount;
    }

    public void setBuyTwoAmount(String buyTwoAmount) {
        this.buyTwoAmount = buyTwoAmount;
    }

    public String getBuyThree() {
        return buyThree;
    }

    public void setBuyThree(String buyThree) {
        this.buyThree = buyThree;
    }

    public String getBuyThreeAmount() {
        return buyThreeAmount;
    }

    public void setBuyThreeAmount(String buyThreeAmount) {
        this.buyThreeAmount = buyThreeAmount;
    }

    public String getBuyFour() {
        return buyFour;
    }

    public void setBuyFour(String buyFour) {
        this.buyFour = buyFour;
    }

    public String getBuyFourAmount() {
        return buyFourAmount;
    }

    public void setBuyFourAmount(String buyFourAmount) {
        this.buyFourAmount = buyFourAmount;
    }

    public String getBuyFive() {
        return buyFive;
    }

    public void setBuyFive(String buyFive) {
        this.buyFive = buyFive;
    }

    public String getBuyFiveAmount() {
        return buyFiveAmount;
    }

    public void setBuyFiveAmount(String buyFiveAmount) {
        this.buyFiveAmount = buyFiveAmount;
    }

    public String getSellOne() {
        return sellOne;
    }

    public void setSellOne(String sellOne) {
        this.sellOne = sellOne;
    }

    public String getSellOneAmount() {
        return sellOneAmount;
    }

    public void setSellOneAmount(String sellOneAmount) {
        this.sellOneAmount = sellOneAmount;
    }

    public String getSellTwo() {
        return sellTwo;
    }

    public void setSellTwo(String sellTwo) {
        this.sellTwo = sellTwo;
    }

    public String getSellTwoAmount() {
        return sellTwoAmount;
    }

    public void setSellTwoAmount(String sellTwoAmount) {
        this.sellTwoAmount = sellTwoAmount;
    }

    public String getSellThree() {
        return sellThree;
    }

    public void setSellThree(String sellThree) {
        this.sellThree = sellThree;
    }

    public String getSellThreeAmount() {
        return sellThreeAmount;
    }

    public void setSellThreeAmount(String sellThreeAmount) {
        this.sellThreeAmount = sellThreeAmount;
    }

    public String getSellFour() {
        return sellFour;
    }

    public void setSellFour(String sellFour) {
        this.sellFour = sellFour;
    }

    public String getSellFourAmount() {
        return sellFourAmount;
    }

    public void setSellFourAmount(String sellFourAmount) {
        this.sellFourAmount = sellFourAmount;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public MarketValue toMarketValue(){
        MarketValue marketValue = new MarketValue();
        marketValue.setStockId(this.getStockId());
        marketValue.setBidOne(Double.valueOf(this.getBidOne()));
        marketValue.setAskOne(Double.valueOf(this.getBidSellOne()));
        marketValue.setBidAskOne(Double.valueOf(this.getBidSellOne()));
        marketValue.setBuyFive(Double.valueOf(this.getBuyFive()));
        marketValue.setBuyFiveAmount(Integer.valueOf(this.getBuyFiveAmount()));
        marketValue.setBuyFour(Double.valueOf(this.getBuyFour()));
        marketValue.setBuyFourAmount(Integer.valueOf(this.getBuyFourAmount()));
        marketValue.setBuyThree(Double.valueOf(this.getBuyThree()));
        marketValue.setBuyThreeAmount(Integer.valueOf(this.getBuyThreeAmount()));
        marketValue.setBuyTwo(Double.valueOf(this.getBuyTwo()));
        marketValue.setBuyTwoAmount(Integer.valueOf(this.getBuyTwoAmount()));
        marketValue.setBuyOne(Double.valueOf(this.getBuyOne()));
        marketValue.setBuyOneAmount(Integer.valueOf(this.getBuyOneAmount()));
        marketValue.setAskFour(Double.valueOf(this.getSellFour()));
        marketValue.setAskFourAmount(Integer.valueOf(this.getSellFourAmount()));
        marketValue.setAskThree(Double.valueOf(this.getSellThree()));
        marketValue.setAskThreeAmount(Integer.valueOf(this.getSellThreeAmount()));
        marketValue.setAskTwo(Double.valueOf(this.getSellTwo()));
        marketValue.setAskTwoAmount(Integer.valueOf(this.getSellTwoAmount()));
        marketValue.setAskOne(Double.valueOf(this.getSellOne()));
        marketValue.setAskOneAmount(Integer.valueOf(this.getSellOneAmount()));
        marketValue.setCurrent(Double.valueOf(this.getCurrent()));
        marketValue.setStockName(this.getStockName());
        marketValue.setOpen(Double.valueOf(this.getOpen()));
        marketValue.setPreClose(Double.valueOf(this.getPreClose()));
        marketValue.setHighest(Double.valueOf(this.getHighest()));
        marketValue.setLowest(Double.valueOf(this.getLowest()));
        marketValue.setSettlement(Double.valueOf(this.getSettlement()));
        marketValue.setSettlementAmount(Long.valueOf(this.getSettlementAmount()));
        marketValue.setTimestamp(this.getTime().getTime());
        return marketValue;
    }
}
