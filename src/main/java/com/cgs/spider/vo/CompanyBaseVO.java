package com.cgs.spider.vo;

import com.cgs.spider.entity.CompanyBase;

/**
 * Created by Administrator on 2017/5/29.
 */
public class CompanyBaseVO {

    private static String REPLACE_STRING = "%|万|亿";
    private static String REPLACE_BOOLEAN_STRING = "true|false";

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
        perShareEarnings = perShareEarnings.replaceAll(REPLACE_STRING,"");
        if (perShareEarnings.equals("false")){
            perShareEarnings = "0";
        }
        this.perShareEarnings = perShareEarnings;
    }

    public String getRetainedProfits() {
        return retainedProfits;
    }

    public void setRetainedProfits(String retainedProfits) {
        retainedProfits = retainedProfits.replaceAll(REPLACE_STRING,"");
        if (retainedProfits.equals("false")){
            retainedProfits = "0";
        }
        this.retainedProfits = retainedProfits;
    }

    public String getIncreaseInRetainedProfits() {
        return increaseInRetainedProfits;
    }

    public void setIncreaseInRetainedProfits(String increaseInRetainedProfits) {
        increaseInRetainedProfits = increaseInRetainedProfits.replaceAll(REPLACE_STRING,"");
        if (increaseInRetainedProfits.equals("false")){
            increaseInRetainedProfits = "0";
        }
        this.increaseInRetainedProfits = increaseInRetainedProfits;
    }

    public String getIncreaseInNetProfit() {
        return increaseInNetProfit;
    }

    public void setIncreaseInNetProfit(String increaseInNetProfit) {
        increaseInNetProfit = increaseInNetProfit.replaceAll(REPLACE_STRING,"");
        if (increaseInNetProfit.equals("false")){
            increaseInNetProfit = "0";
        }
        this.increaseInNetProfit = increaseInNetProfit;
    }

    public String getNonNetProfitDeduction() {
        return nonNetProfitDeduction;
    }

    public void setNonNetProfitDeduction(String nonNetProfitDeduction) {
        nonNetProfitDeduction = nonNetProfitDeduction.replaceAll(REPLACE_STRING,"");
        if (nonNetProfitDeduction.equals("false")){
            nonNetProfitDeduction = "0";
        }
        this.nonNetProfitDeduction = nonNetProfitDeduction;
    }

    public String getIncreaseInNonNetProfitDeduction() {
        return increaseInNonNetProfitDeduction;
    }

    public void setIncreaseInNonNetProfitDeduction(String increaseInNonNetProfitDeduction) {
        increaseInNonNetProfitDeduction = increaseInNonNetProfitDeduction.replaceAll(REPLACE_STRING,"");
        if (increaseInNonNetProfitDeduction.equals("false")){
            increaseInNonNetProfitDeduction = "0";
        }
        this.increaseInNonNetProfitDeduction = increaseInNonNetProfitDeduction;
    }

    public String getGrossRevenue() {
        return grossRevenue;
    }

    public void setGrossRevenue(String grossRevenue) {
        grossRevenue = grossRevenue.replaceAll(REPLACE_STRING,"");
        if (grossRevenue.equals("false")){
            grossRevenue = "0";
        }
        this.grossRevenue = grossRevenue;
    }

    public String getYearOnYearGrowthRateOfTotalRevenue() {
        return yearOnYearGrowthRateOfTotalRevenue;
    }

    public void setYearOnYearGrowthRateOfTotalRevenue(String yearOnYearGrowthRateOfTotalRevenue) {
        yearOnYearGrowthRateOfTotalRevenue = yearOnYearGrowthRateOfTotalRevenue.replaceAll(REPLACE_STRING,"");
        if (yearOnYearGrowthRateOfTotalRevenue.equals("false")){
            yearOnYearGrowthRateOfTotalRevenue = "0";
        }
        this.yearOnYearGrowthRateOfTotalRevenue = yearOnYearGrowthRateOfTotalRevenue;
    }

    public String getNetAssertValuePerShare() {
        return netAssertValuePerShare;
    }

    public void setNetAssertValuePerShare(String netAssertValuePerShare) {
        netAssertValuePerShare = netAssertValuePerShare.replaceAll(REPLACE_STRING,"");
        if (netAssertValuePerShare.equals("false")){
            netAssertValuePerShare = "0";
        }
        this.netAssertValuePerShare = netAssertValuePerShare;
    }

    public String getRateOfReturnOnCommonStockholders() {
        return rateOfReturnOnCommonStockholders;
    }

    public void setRateOfReturnOnCommonStockholders(String rateOfReturnOnCommonStockholders) {
        rateOfReturnOnCommonStockholders = rateOfReturnOnCommonStockholders.replaceAll(REPLACE_STRING,"");
        if (rateOfReturnOnCommonStockholders.equals("false")){
            rateOfReturnOnCommonStockholders = "0";
        }
        this.rateOfReturnOnCommonStockholders = rateOfReturnOnCommonStockholders;
    }

    public String getNetAssertYieldDiluted() {
        return netAssertYieldDiluted;
    }

    public void setNetAssertYieldDiluted(String netAssertYieldDiluted) {
        netAssertYieldDiluted = netAssertYieldDiluted.replaceAll(REPLACE_STRING,"");
        if (netAssertYieldDiluted.equals("false")){
            netAssertYieldDiluted = "0";
        }
        this.netAssertYieldDiluted = netAssertYieldDiluted;
    }

    public String getCapitalReversePerShare() {
        return capitalReversePerShare;
    }

    public void setCapitalReversePerShare(String capitalReversePerShare) {
        capitalReversePerShare = capitalReversePerShare.replaceAll(REPLACE_STRING,"");
        if (capitalReversePerShare.equals("false")){
            capitalReversePerShare = "0";
        }
        this.capitalReversePerShare = capitalReversePerShare;
    }

    public String getOperationCashFlowPerShare() {
        return operationCashFlowPerShare;
    }

    public void setOperationCashFlowPerShare(String operationCashFlowPerShare) {
        operationCashFlowPerShare.replaceAll(REPLACE_STRING,"");
        if (operationCashFlowPerShare.equals("false")){
            operationCashFlowPerShare = "0";
        }
        this.operationCashFlowPerShare = operationCashFlowPerShare;
    }

    public String getGrossProfitMargin() {
        return grossProfitMargin;
    }

    public void setGrossProfitMargin(String grossProfitMargin) {
        grossProfitMargin = grossProfitMargin.replaceAll(REPLACE_STRING,"");
        if (grossProfitMargin.equals("false")){
            grossProfitMargin = "0";
        }
        this.grossProfitMargin = grossProfitMargin;
    }

    public String getInventoryTurnoverRatio() {
        return inventoryTurnoverRatio;
    }

    public void setInventoryTurnoverRatio(String inventoryTurnoverRatio) {
        inventoryTurnoverRatio = inventoryTurnoverRatio.replaceAll(REPLACE_STRING,"");
        if (inventoryTurnoverRatio.equals("false")){
            inventoryTurnoverRatio = "0";
        }
        this.inventoryTurnoverRatio = inventoryTurnoverRatio;
    }

    public String getNetProfitMarginOnSales() {
        return netProfitMarginOnSales;
    }

    public void setNetProfitMarginOnSales(String netProfitMarginOnSales) {
        netProfitMarginOnSales = netProfitMarginOnSales.replaceAll(REPLACE_STRING,"");
        if (netProfitMarginOnSales.equals("false")){
            netProfitMarginOnSales = "0";
        }
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
        companyBase.setNetProfitMarginOnSales(Double.valueOf(this.getNetProfitMarginOnSales()));
        return companyBase;
    }



}
