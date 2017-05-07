package com.cgs.spider.launcher;

import org.springframework.beans.BeanInstantiationException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/5/7.
 */
public class SpiderLauncher {

    public static void main(String[] args){
        String path = "applicationContext.xml";
        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(path);
            context.start();
        } catch (BeanInstantiationException e) {
            e.printStackTrace();
        }
    }
}
