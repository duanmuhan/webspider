package com.cgs.spider.vo;

import com.cgs.spider.entity.CompanyBase;

/**
 * Created by Administrator on 2017/5/29.
 */
public class CompanyBaseVO {

    private String stockId;
    private String perShareEarnings;
    private String retainedProfits;
    private String increaseInRetainedProfits;
    private String increaseInNetProfit;
    private String nonNetProfitDeduction;
    private String increaseInNonNetProfitDeduction;
    private String grossRevenue;
    private String yearOnYearGrowthRateOfTotalRevenue;
    private String netAssertValuePerShare;
    private String rateOfReturnOnCommonStockholders;
    private String netAssertYieldDiluted;
    private String capitalReversePerShare;
    private String operationCashFlowPerShare;
    private String grossProfitMargin;
    private String inventoryTurnoverRatio;
    private String netProfitMarginOnSales;
    private String date;

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    public String getPerShareEarnings() {
        return perShareEarnings;
    }

    public void setPerShareEarnings(String perShareEarnings) {
        this.perShareEarnings = perShareEarnings;
    }

    public String getRetainedProfits() {
        return retainedProfits;
    }

    public void setRetainedProfits(String retainedProfits) {
        this.retainedProfits = retainedProfits;
    }

    public String getIncreaseInRetainedProfits() {
        return increaseInRetainedProfits;
    }

    public void setIncreaseInRetainedProfits(String increaseInRetainedProfits) {
        this.increaseInRetainedProfits = increaseInRetainedProfits;
    }

    public String getIncreaseInNetProfit() {
        return increaseInNetProfit;
    }

    public void setIncreaseInNetProfit(String increaseInNetProfit) {
        this.increaseInNetProfit = increaseInNetProfit;
    }

    public String getNonNetProfitDeduction() {
        return nonNetProfitDeduction;
    }

    public void setNonNetProfitDeduction(String nonNetProfitDeduction) {
        this.nonNetProfitDeduction = nonNetProfitDeduction;
    }

    public String getIncreaseInNonNetProfitDeduction() {
        return increaseInNonNetProfitDeduction;
    }

    public void setIncreaseInNonNetProfitDeduction(String increaseInNonNetProfitDeduction) {
        this.increaseInNonNetProfitDeduction = increaseInNonNetProfitDeduction;
    }

    public String getGrossRevenue() {
        return grossRevenue;
    }

    public void setGrossRevenue(String grossRevenue) {
        this.grossRevenue = grossRevenue;
    }

    public String getYearOnYearGrowthRateOfTotalRevenue() {
        return yearOnYearGrowthRateOfTotalRevenue;
    }

    public void setYearOnYearGrowthRateOfTotalRevenue(String yearOnYearGrowthRateOfTotalRevenue) {
        this.yearOnYearGrowthRateOfTotalRevenue = yearOnYearGrowthRateOfTotalRevenue;
    }

    public String getNetAssertValuePerShare() {
        return netAssertValuePerShare;
    }

    public void setNetAssertValuePerShare(String netAssertValuePerShare) {
        this.netAssertValuePerShare = netAssertValuePerShare;
    }

    public String getRateOfReturnOnCommonStockholders() {
        return rateOfReturnOnCommonStockholders;
    }

    public void setRateOfReturnOnCommonStockholders(String rateOfReturnOnCommonStockholders) {
        this.rateOfReturnOnCommonStockholders = rateOfReturnOnCommonStockholders;
    }

    public String getNetAssertYieldDiluted() {
        return netAssertYieldDiluted;
    }

    public void setNetAssertYieldDiluted(String netAssertYieldDiluted) {
        this.netAssertYieldDiluted = netAssertYieldDiluted;
    }

    public String getCapitalReversePerShare() {
        return capitalReversePerShare;
    }

    public void setCapitalReversePerShare(String capitalReversePerShare) {
        this.capitalReversePerShare = capitalReversePerShare;
    }

    public String getOperationCashFlowPerShare() {
        return operationCashFlowPerShare;
    }

    public void setOperationCashFlowPerShare(String operationCashFlowPerShare) {
        this.operationCashFlowPerShare = operationCashFlowPerShare;
    }

    public String getGrossProfitMargin() {
        return grossProfitMargin;
    }

    public void setGrossProfitMargin(String grossProfitMargin) {
        this.grossProfitMargin = grossProfitMargin;
    }

    public String getInventoryTurnoverRatio() {
        return inventoryTurnoverRatio;
    }

    public void setInventoryTurnoverRatio(String inventoryTurnoverRatio) {
        this.inventoryTurnoverRatio = inventoryTurnoverRatio;
    }

    public String getNetProfitMarginOnSales() {
        return netProfitMarginOnSales;
    }

    public void setNetProfitMarginOnSales(String netProfitMarginOnSales) {
        this.netProfitMarginOnSales = netProfitMarginOnSales;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public CompanyBase toCompanyBase(){
        CompanyBase companyBase = new CompanyBase();
        companyBase.setStockId(Integer.valueOf(this.getStockId()));
        companyBase.setCapitalReversePerShare(Double.valueOf(this.getCapitalReversePerShare()));
        companyBase.setPerShareEarnings(Double.valueOf(this.getPerShareEarnings()));
        companyBase.setRetainedProfits(Double.valueOf(this.getRetainedProfits()));
        companyBase.setIncreaseInNetProfit(Double.valueOf(this.getIncreaseInNetProfit()));
        companyBase.setIncreaseInRetainedProfits(Double.valueOf(this.getIncreaseInRetainedProfits()));
        companyBase.setNonNetProfitDeduction(Double.valueOf(this.getNonNetProfitDeduction()));
        companyBase.setIncreaseInNonNetProfitDeduction(Double.valueOf(this.getIncreaseInNonNetProfitDeduction()));
        companyBase.setGrossRevenue(Double.valueOf(this.getGrossRevenue()));
        companyBase.setYearOnYearGrowthRateOfTotalRevenue(Double.valueOf(this.getYearOnYearGrowthRateOfTotalRevenue()));
        companyBase.setNetAssertValuePerShare(Double.valueOf(this.getNetAssertValuePerShare()));
        companyBase.setRateOfReturnOnCommonStockholders(Double.valueOf(this.getRateOfReturnOnCommonStockholders()));
        companyBase.setNetAssertYieldDiluted(Double.valueOf(this.getNetAssertYieldDiluted()));
        companyBase.setCapitalReversePerShare(Double.valueOf(this.getCapitalReversePerShare()));
        companyBase.setOperationCashFlowPerShare(Double.valueOf(this.getOperationCashFlowPerShare()));
        companyBase.setGrossProfitMargin(Double.valueOf(this.getGrossProfitMargin()));
        companyBase.setInventoryTurnoverRatio(Double.valueOf(this.getInventoryTurnoverRatio()));
        companyBase.setNetProfitMarginonSales(Double.valueOf(this.getNetProfitMarginOnSales()));
        return companyBase;
    }
}
