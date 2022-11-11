package com.hikvision.controller;

import com.hikvision.repository.PersonInfoEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @description（类描述）: swagger注解测试
 * @author（创建人）: xuwenbiao
 * @Date 2022/11/8 9:23
 */
@Slf4j
@RestController
@RequestMapping("/ces1")
@Api(value = "测试1", tags = "接口所属标签1")
public class SwaggerTest {


    @GetMapping("/test")
    @ApiOperation(value = "测试1：普通测试接口")
    public String test() {
        return "success";
    }

    /**
     * 测试swagger注解的作用
     *
     * @return
     */

    @PostMapping("/test2")
    @ApiOperation(value = "接口名", notes = "接口描述", httpMethod = "POST", tags = {"tag1"}) //在这里也可以修改标签。如果上面类著名了标签，这个标签和类的标签不一致，那么就会显示两个标签
    public String test2(@RequestBody PersonInfoEntity person) {
        log.info("person:{}", person);
        return "success";
    }
}
