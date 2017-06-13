package com.cgs.spider.entity;

import java.util.Date;

/**
 * Created by Administrator on 2017/5/15.
 */
public class CompanyBase {

    private final static String FIELD_SEPERATOR = ",";

    private int stockId;
    private double perShareEarnings;
    private double retainedProfits;
    private double increaseInRetainedProfits;
    private double increaseInNetProfit;
    private double nonNetProfitDeduction;
    private double increaseInNonNetProfitDeduction;
    private double grossRevenue;
    private double yearOnYearGrowthRateOfTotalRevenue;
    private double netAssertValuePerShare;
    private double rateOfReturnOnCommonStockholders;
    private double netAssertYieldDiluted;
    private double assetLiabilityRatio;
    private double capitalReversePerShare;
    private double retainedEarnings;
    private double operationCashFlowPerShare;
    private double grossProfitMargin;
    private double inventoryTurnoverRatio;
    private double netProfitMarginOnSales;
    private Date date;

    public int getStockId() {
        return stockId;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }

    public double getPerShareEarnings() {
        return perShareEarnings;
    }

    public void setPerShareEarnings(double perShareEarnings) {
        this.perShareEarnings = perShareEarnings;
    }

    public double getRetainedProfits() {
        return retainedProfits;
    }

    public void setRetainedProfits(double retainedProfits) {
        this.retainedProfits = retainedProfits;
    }

    public double getIncreaseInRetainedProfits() {
        return increaseInRetainedProfits;
    }

    public void setIncreaseInRetainedProfits(double increaseInRetainedProfits) {
        this.increaseInRetainedProfits = increaseInRetainedProfits;
    }

    public double getIncreaseInNetProfit() {
        return increaseInNetProfit;
    }

    public void setIncreaseInNetProfit(double increaseInNetProfit) {
        this.increaseInNetProfit = increaseInNetProfit;
    }

    public double getNonNetProfitDeduction() {
        return nonNetProfitDeduction;
    }

    public void setNonNetProfitDeduction(double nonNetProfitDeduction) {
        this.nonNetProfitDeduction = nonNetProfitDeduction;
    }

    public double getIncreaseInNonNetProfitDeduction() {
        return increaseInNonNetProfitDeduction;
    }

    public void setIncreaseInNonNetProfitDeduction(double increaseInNonNetProfitDeduction) {
        this.increaseInNonNetProfitDeduction = increaseInNonNetProfitDeduction;
    }

    public double getGrossRevenue() {
        return grossRevenue;
    }

    public void setGrossRevenue(double grossRevenue) {
        this.grossRevenue = grossRevenue;
    }

    public double getYearOnYearGrowthRateOfTotalRevenue() {
        return yearOnYearGrowthRateOfTotalRevenue;
    }

    public void setYearOnYearGrowthRateOfTotalRevenue(double yearOnYearGrowthRateOfTotalRevenue) {
        this.yearOnYearGrowthRateOfTotalRevenue = yearOnYearGrowthRateOfTotalRevenue;
    }

    public double getNetAssertValuePerShare() {
        return netAssertValuePerShare;
    }

    public void setNetAssertValuePerShare(double netAssertValuePerShare) {
        this.netAssertValuePerShare = netAssertValuePerShare;
    }

    public double getRateOfReturnOnCommonStockholders() {
        return rateOfReturnOnCommonStockholders;
    }

    public void setRateOfReturnOnCommonStockholders(double rateOfReturnOnCommonStockholders) {
        this.rateOfReturnOnCommonStockholders = rateOfReturnOnCommonStockholders;
    }

    public double getNetAssertYieldDiluted() {
        return netAssertYieldDiluted;
    }

    public void setNetAssertYieldDiluted(double netAssertYieldDiluted) {
        this.netAssertYieldDiluted = netAssertYieldDiluted;
    }

    public double getCapitalReversePerShare() {
        return capitalReversePerShare;
    }

    public void setCapitalReversePerShare(double capitalReversePerShare) {
        this.capitalReversePerShare = capitalReversePerShare;
    }

    public double getOperationCashFlowPerShare() {
        return operationCashFlowPerShare;
    }

    public void setOperationCashFlowPerShare(double operationCashFlowPerShare) {
        this.operationCashFlowPerShare = operationCashFlowPerShare;
    }

    public double getGrossProfitMargin() {
        return grossProfitMargin;
    }

    public void setGrossProfitMargin(double grossProfitMargin) {
        this.grossProfitMargin = grossProfitMargin;
    }

    public double getInventoryTurnoverRatio() {
        return inventoryTurnoverRatio;
    }

    public void setInventoryTurnoverRatio(double inventoryTurnoverRatio) {
        this.inventoryTurnoverRatio = inventoryTurnoverRatio;
    }

    public double getNetProfitMarginOnSales() {
        return netProfitMarginOnSales;
    }

    public void setNetProfitMarginOnSales(double netProfitMarginOnSales) {
        this.netProfitMarginOnSales = netProfitMarginOnSales;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAssetLiabilityRatio() {
        return assetLiabilityRatio;
    }

    public void setAssetLiabilityRatio(double assetLiabilityRatio) {
        this.assetLiabilityRatio = assetLiabilityRatio;
    }

    public double getRetainedEarnings() {
        return retainedEarnings;
    }

    public void setRetainedEarnings(double retainedEarnings) {
        this.retainedEarnings = retainedEarnings;
    }

    public String toRedisString(){
        return stockId + FIELD_SEPERATOR + perShareEarnings + FIELD_SEPERATOR + retainedProfits + FIELD_SEPERATOR + increaseInRetainedProfits
                + FIELD_SEPERATOR + increaseInNetProfit + FIELD_SEPERATOR + nonNetProfitDeduction + FIELD_SEPERATOR + increaseInNonNetProfitDeduction
                + FIELD_SEPERATOR + grossRevenue + FIELD_SEPERATOR + yearOnYearGrowthRateOfTotalRevenue + FIELD_SEPERATOR + netAssertValuePerShare
                + FIELD_SEPERATOR + rateOfReturnOnCommonStockholders + FIELD_SEPERATOR + netAssertYieldDiluted + capitalReversePerShare
                + FIELD_SEPERATOR + operationCashFlowPerShare + FIELD_SEPERATOR + grossProfitMargin + FIELD_SEPERATOR + inventoryTurnoverRatio
                + FIELD_SEPERATOR + netProfitMarginOnSales + FIELD_SEPERATOR + date;
    }
}
