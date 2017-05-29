package com.cgs.spider.dao;

import com.cgs.spider.constant.RedisKeys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/5/15.
 */
@Repository
public class CompanyDao {

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    public void saveCompanyInfo(String stockId,String content){
        ValueOperations<String,String> operations = redisTemplate.opsForValue();
        operations.set(RedisKeys.key(stockId),content);
    }

    public void saveCompanyInfoList(String stockId,List<String> list){

    }
}
