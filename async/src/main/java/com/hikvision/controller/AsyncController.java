package com.hikvision.controller;

import com.hikvision.config.AsyncConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description（类描述）: 一句话描述该类的功能
 * @author（创建人）: user
 * @Date 2022/11/8 17:37
 */
@RestController
public class AsyncController {

    @Autowired
    AsyncConfig asyncConfig;

    @GetMapping("/test")
    public String test() throws InterruptedException {
        long T1 = System.currentTimeMillis();
        asyncConfig.task1();
        asyncConfig.task2();
        long T2 = System.currentTimeMillis();
        System.out.println("共同消耗的时间：" + (T2 - T1) + "ms");
        return "success";
    }
}
