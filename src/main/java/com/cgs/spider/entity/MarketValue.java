package com.cgs.spider.entity;

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
    private int bidAskOne;
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
    private double askOne;
    private int askOneAmount;
    private double askTwo;
    private int askTwoAmount;
    private double askThree;
    private int askThreeAmount;
    private double askFour;
    private int askFourAmount;
    private Date date;
    private Date time;

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

    public int getBidAskOne() {
        return bidAskOne;
    }

    public void setBidAskOne(int bidAskOne) {
        this.bidAskOne = bidAskOne;
    }

    public double getAskOne() {
        return askOne;
    }

    public void setAskOne(double askOne) {
        this.askOne = askOne;
    }

    public int getAskOneAmount() {
        return askOneAmount;
    }

    public void setAskOneAmount(int askOneAmount) {
        this.askOneAmount = askOneAmount;
    }

    public double getAskTwo() {
        return askTwo;
    }

    public void setAskTwo(double askTwo) {
        this.askTwo = askTwo;
    }

    public int getAskTwoAmount() {
        return askTwoAmount;
    }

    public void setAskTwoAmount(int askTwoAmount) {
        this.askTwoAmount = askTwoAmount;
    }

    public double getAskThree() {
        return askThree;
    }

    public void setAskThree(double askThree) {
        this.askThree = askThree;
    }

    public int getAskThreeAmount() {
        return askThreeAmount;
    }

    public void setAskThreeAmount(int askThreeAmount) {
        this.askThreeAmount = askThreeAmount;
    }

    public double getAskFour() {
        return askFour;
    }

    public void setAskFour(double askFour) {
        this.askFour = askFour;
    }

    public int getAskFourAmount() {
        return askFourAmount;
    }

    public void setAskFourAmount(int askFourAmount) {
        this.askFourAmount = askFourAmount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
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
