package com.hikvision.consumer;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @description（类描述）: 一句话描述该类的功能
 * @author（创建人）: xuwenbiao
 * @Date 2022/11/9 9:31
 */

@Slf4j
@RestController
@RequestMapping("/getConsumer")
@Api(tags = "消费者consumer")
public class GetConsumer {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/test")
    @ApiOperation(value = "restTemplate消费者请求Get测试")
    public String test() {
        //query 参数是将参数和值存放到url中进行传递的。
        String url = "http://localhost:8080/restTemplate/getProducer/test?name=xuwenbiao&age=123&phone=1231412";
        ResponseEntity<String> exchange = restTemplate.exchange(url, HttpMethod.GET, null, String.class); //如果返回值类型是Map类型应该怎么办？
        log.info("返回结果：{}", exchange);
        String body = exchange.getBody();
        log.info("返回值：{}", body);
        return "success";
//        ResponseEntity<HashMap> exchange = restTemplate.exchange(url, HttpMethod.GET, null, HashMap.class); //如果返回值类型是Map类型应该怎么办？
//        log.info("返回结果：{}", exchange);
//        HashMap body = exchange.getBody(); //主要是看返回值，如果返回值类型是什么，那么这个地方就写什么。
//        log.info("返回值：{}", body);
    }

    @GetMapping("/test2")
    public String test2() {
        return "success";
    }


}
