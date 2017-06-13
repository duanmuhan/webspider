# 爬虫文档

## 爬虫功能
   爬虫采用了jsoup + httpclient 的爬取形式来提取股票的信息，主要爬取源为东方财富网，同花顺网站，新浪财经接口。
爬取下来的数据主要包含了以下两种：

- 上市公司的基本信息
- 股票的实时行情

## 实体介绍

#### CompanyInfo 实体：

字段名称  | 字段描述 | 字段类型
---|---|---
stockId | 上市公司股票id | int
perShareEarnings | 每股收益 | double
retainedProfits | 净利润 | double
increaseInRetainedProfits | 净利润同比增长率 | double
increaseInNetProfit | 净利润环比增长率 | double
nonNetProfitDeduction | 扣非净利润 | double
increaseInNonNetProfitDeduction | 扣非净利润同比增长率 | double
grossRevenue | 营业总收入 | double
yearOnYearGrowthRateOfTotalRevenue | 营业总收入同比增长率 | double
netAssertValuePerShare | 每股净资产 | double
rateOfReturnOnCommonStockholders | 净资产收益率 | double
netAssertYieldDiluted | 净资产收益率-摊薄| double
assetLiabilityRatio | 资产负债比率 | double
capitalReversePerShare | 每股本公积金| double
retainedEarnings | 每股未分配利润 | double
operationCashFlowPerShare | 每股经营现金流 |double
grossProfitMargin | 销售毛利率 |double
inventoryTurnoverRatio | 存货周转率 |double
netProfitMarginOnSales | 销售净利率 |double
date | 发布日期 | Date


#### MarketValue 实体：

字段名称  | 字段描述 | 字段类型
---|---|---
stockId | 上市公司股票id | int
stockName | 上市公司股票名称 | String
open | 开盘价 | double
preClose | 昨收价 | double
current | 当前价 | double
highest | 最高价 | double
lowest | 最低价 | double
bidOne | 竞买价 | double
bidAskOne | 竞卖价 | double
settlement | 成交价 | double
settlementAmount | 成交量 | double
buyOne | 买一价 | double
buyOneAmount | 买一量 | int
buyTwo | 买二价 | double
buyTwoAmount | 买二量 | int
buyThree | 买三价 | double
buyThreeAmount | 买三量 | int
buyFour | 买四价 | double
buyFourAmount | 买四量 | int
buyFive | 买五价 | double
buyFiveAmount | 买五量 | int
askOne | 卖一价 | double
askOneAmount | 卖一量 | int
askTwo | 卖二价 | double
askTwoAmount | 卖二量 | int
askThree | 卖三价 | double
askThreeAmount | 卖三量 | int
askFour | 卖四价 | double
askFourAmount | 卖四量 | int
date | 数据日期 | Date
time | 数据时间 | Date
