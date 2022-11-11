package com.hikvision.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description（类描述）: 一句话描述该类的功能
 * @author（创建人）: user
 * @Date 2022/11/8 19:10
 */
@RestController
@Slf4j
public class Slf4jController {

    @GetMapping("/test")
    public String test() {
        log.info("测试：{}", 1);
        log.info("测试：{},{}",1,2);
        log.info("测试：{}");
        return "success";
    }

}
