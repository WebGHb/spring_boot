package com.hikvision.producer;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


/**
 * @description（类描述）: 一句话描述该类的功能
 * @author（创建人）: user
 * @Date 2022/11/9 9:32
 */
@Slf4j
@RestController
@RequestMapping("/getProducer")
@Api(tags = "生产者producer")
public class GetProducer {

    //http://localhost:8080/restTemplate/swagger-ui.html
    //http://localhost:8080/restTemplate/doc.html

    @ApiOperation(value = "query 参数测试")
    @GetMapping("/param")
    public Map<String, String> test(@RequestParam(name = "name", required = true) String name, //name和value是等价的
                                    @RequestParam(value = "age", required = false, defaultValue = "1") String age,
                                    @RequestParam(value = "phone", required = true, defaultValue = "12345") String phone) { //defaultValue,true无效，因为不输入也会默认

        log.info("姓名：{}", name);
        log.info("年龄：{}", age);
        log.info("手机号：{}", phone);

        Map<String, String> map = new HashMap<>();
        map.put("data", "success");
        return map;
    }

    @ApiOperation(value = "header 参数测试")
    @GetMapping("/header")
    public Map<String, String> test2(@RequestHeader(value = "token", required = true) String token,
                                     @RequestParam(value = "name", required = true) String name) { //defaultValue,true无效，因为不输入也会默认
        log.info("验证：{}", token);
        log.info("姓名：{}", name);

        Map<String, String> map = new HashMap<>();
        map.put("data", "success");
        return map;
    }

    @ApiOperation(value = "path 参数测试")
    @GetMapping("/path/{path}")
    public Map<String, String> test3(@RequestHeader(value = "token", required = false) String token,
                                     @RequestParam(value = "name", required = false) String name,
                                     @PathVariable(value = "path", required = true) String path) { //defaultValue,true无效，因为不输入也会默认
        log.info("验证：{}", token);
        log.info("姓名：{}", name);
        log.info("路径：{}", path);

        Map<String, String> map = new HashMap<>();
        map.put("data", "success");
        return map;
    }

//    @ApiOperation(value = "attribute参数测试")
//    @GetMapping("/test3")
//    public Map<String, String> test3(@RequestHeader(value = "name", required = false) String name) { //defaultValue,true无效，因为不输入也会默认
//        log.info("姓名：{}", name);
//
//        Map<String, String> map = new HashMap<>();
//        map.put("data", "success");
//        return map;
//    }

}
