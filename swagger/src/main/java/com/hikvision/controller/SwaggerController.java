package com.hikvision.controller;

import com.hikvision.repository.PersonInfoEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @description（类描述）: 一句话描述该类的功能
 * @author（创建人）: user
 * @Date 2022/11/10 10:01
 */
@Api(tags = "swagger常用注解测试")
@Slf4j
@RestController
@RequestMapping("/swaggerTest")
public class SwaggerController {


    @GetMapping("/test")
    @ApiOperation(value = "方法名")
    @ApiImplicitParams({ //如果使用是的body那么可以不使用
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "name", value = "姓名"),
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "age", value = "年龄")
    })
    public String test(@RequestBody(required = true) String name,
                       @RequestBody(required = false) String age) {
        PersonInfoEntity person = PersonInfoEntity.builder()
                .name(name)
                .age(age)
                .build();
        log.info("personInf:{}", person);
        return "success";
    }

}
