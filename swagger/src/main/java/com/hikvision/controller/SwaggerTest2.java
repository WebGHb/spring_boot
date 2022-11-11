package com.hikvision.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description（类描述）: 一句话描述该类的功能
 * @author（创建人）: user
 * @Date 2022/11/8 10:05
 */
@Slf4j
@RestController
@RequestMapping("/ces2")
@Api(value = "测试2", tags = "接口所属标签1")
public class SwaggerTest2 {

    @GetMapping("/test")
    @ApiOperation(value = "测试2：普通测试接口")
    public String test() {
        return "success";
    }

}
