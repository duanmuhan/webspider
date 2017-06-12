package com.cgs.spider.entity;

import java.sql.Time;
import java.util.Date;

/**
 * Created by Administrator on 2017/5/29.
 */
public class MarketValue {

    private final static String FEILD_SPERATOR=",";

    private int stockId;
    private String stockName;
    private double open;
    private double preClose;
    private double current;
    private double highest;
    private double lowest;
    private int bidOne;
    private int bidSellOne;
    private double settlement;
    private int settlementAmount;
    private double buyOne;
    private int buyOneAmount;
    private double buyTwo;
    private int buyTwoAmount;
    private double buyThree;
    private int buyThreeAmount;
    private double buyFour;
    private int buyFourAmount;
    private double buyFive;
    private int buyFiveAmount;
    private double sellOne;
    private int sellOneAmount;
    private double sellTwo;
    private int sellTwoAmount;
    private double sellThree;
    private int sellThreeAmount;
    private double sellFour;
    private int sellFourAmount;
    private Date date;
    private Time time;

    public int getStockId() {
        return stockId;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public double getOpen() {
        return open;
    }

    public void setOpen(double open) {
        this.open = open;
    }

    public double getPreClose() {
        return preClose;
    }

    public void setPreClose(double preClose) {
        this.preClose = preClose;
    }

    public double getCurrent() {
        return current;
    }

    public void setCurrent(double current) {
        this.current = current;
    }

    public double getHighest() {
        return highest;
    }

    public void setHighest(double highest) {
        this.highest = highest;
    }

    public double getLowest() {
        return lowest;
    }

    public void setLowest(double lowest) {
        this.lowest = lowest;
    }

    public int getBidOne() {
        return bidOne;
    }

    public void setBidOne(int bidOne) {
        this.bidOne = bidOne;
    }

    public int getBidSellOne() {
        return bidSellOne;
    }

    public void setBidSellOne(int bidSellOne) {
        this.bidSellOne = bidSellOne;
    }

    public double getSettlement() {
        return settlement;
    }

    public void setSettlement(double settlement) {
        this.settlement = settlement;
    }

    public int getSettlementAmount() {
        return settlementAmount;
    }

    public void setSettlementAmount(int settlementAmount) {
        this.settlementAmount = settlementAmount;
    }

    public double getBuyOne() {
        return buyOne;
    }

    public void setBuyOne(double buyOne) {
        this.buyOne = buyOne;
    }

    public int getBuyOneAmount() {
        return buyOneAmount;
    }

    public void setBuyOneAmount(int buyOneAmount) {
        this.buyOneAmount = buyOneAmount;
    }

    public double getBuyTwo() {
        return buyTwo;
    }

    public void setBuyTwo(double buyTwo) {
        this.buyTwo = buyTwo;
    }

    public double getBuyThree() {
        return buyThree;
    }

    public void setBuyThree(double buyThree) {
        this.buyThree = buyThree;
    }

    public int getBuyThreeAmount() {
        return buyThreeAmount;
    }

    public void setBuyThreeAmount(int buyThreeAmount) {
        this.buyThreeAmount = buyThreeAmount;
    }

    public double getBuyFour() {
        return buyFour;
    }

    public void setBuyFour(double buyFour) {
        this.buyFour = buyFour;
    }

    public int getBuyFourAmount() {
        return buyFourAmount;
    }

    public void setBuyFourAmount(int buyFourAmount) {
        this.buyFourAmount = buyFourAmount;
    }

    public double getBuyFive() {
        return buyFive;
    }

    public void setBuyFive(double buyFive) {
        this.buyFive = buyFive;
    }

    public int getBuyFiveAmount() {
        return buyFiveAmount;
    }

    public void setBuyFiveAmount(int buyFiveAmount) {
        this.buyFiveAmount = buyFiveAmount;
    }

    public double getSellOne() {
        return sellOne;
    }

    public void setSellOne(double sellOne) {
        this.sellOne = sellOne;
    }

    public int getSellOneAmount() {
        return sellOneAmount;
    }

    public void setSellOneAmount(int sellOneAmount) {
        this.sellOneAmount = sellOneAmount;
    }

    public double getSellTwo() {
        return sellTwo;
    }

    public void setSellTwo(double sellTwo) {
        this.sellTwo = sellTwo;
    }

    public int getSellTwoAmount() {
        return sellTwoAmount;
    }

    public void setSellTwoAmount(int sellTwoAmount) {
        this.sellTwoAmount = sellTwoAmount;
    }

    public double getSellThree() {
        return sellThree;
    }

    public void setSellThree(double sellThree) {
        this.sellThree = sellThree;
    }

    public int getSellThreeAmount() {
        return sellThreeAmount;
    }

    public void setSellThreeAmount(int sellThreeAmount) {
        this.sellThreeAmount = sellThreeAmount;
    }

    public double getSellFour() {
        return sellFour;
    }

    public void setSellFour(double sellFour) {
        this.sellFour = sellFour;
    }

    public int getSellFourAmount() {
        return sellFourAmount;
    }

    public void setSellFourAmount(int sellFourAmount) {
        this.sellFourAmount = sellFourAmount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public int getBuyTwoAmount() {
        return buyTwoAmount;
    }

    public void setBuyTwoAmount(int buyTwoAmount) {
        this.buyTwoAmount = buyTwoAmount;
    }

    public String toRedisValue(){
        String redisString = "";
        return redisString;
    }
}
