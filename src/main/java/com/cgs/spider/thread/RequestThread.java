package com.cgs.spider.thread;

/**
 * Created by Administrator on 2017/5/7.
 */
public class RequestThread implements Runnable {


  @Override
  public void run() {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
}
