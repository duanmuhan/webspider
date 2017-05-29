package com.cgs.spider.dao;

import com.cgs.spider.entity.CompanyBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.util.ObjectUtils;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/5/15.
 */
@Repository
public class CompanyDao {

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    public void saveCompanyInfo(Map<String,List<CompanyBase>> baseInfoMap){
        if (!ObjectUtils.isEmpty(baseInfoMap)){
            for (String key : baseInfoMap.keySet()){
                List<CompanyBase> companyBaseList = baseInfoMap.get(key);
                for (CompanyBase companyBase : companyBaseList){
                    redisTemplate.opsForList().leftPush(key,companyBase.toRedisString());
                }
            }
        }
    }
}
