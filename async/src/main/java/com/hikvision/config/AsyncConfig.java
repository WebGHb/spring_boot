package com.hikvision.config;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

/**
 * @description（类描述）: 一句话描述该类的功能
 * @author（创建人）: user
 * @Date 2022/11/8 17:15
 */
@Component
//@EnableAsync //添加的位置可以在类中也可以在启动类上：建议在类中
public class AsyncConfig {


    @Async
    public void task1() throws InterruptedException {
        long T1 = System.currentTimeMillis();
        Thread.sleep(2000);
        long T2 = System.currentTimeMillis();
        System.out.println("task1消耗时间" + (T2 - T1) + "ms");

    }

    @Async
    public void task2() throws InterruptedException {
        long T1 = System.currentTimeMillis();
        Thread.sleep(3000);
        long T2 = System.currentTimeMillis();
        System.out.println("task2消耗时间" + (T2 - T1) + "ms");
    }


}
