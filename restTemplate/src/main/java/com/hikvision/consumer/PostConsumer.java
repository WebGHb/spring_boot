package com.hikvision.consumer;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description（类描述）: 一句话描述该类的功能
 * @author（创建人）: xuwenbiao
 * @Date 2022/11/9 9:31
 */

@RestController
@RequestMapping("/postConsumer")
@Api(tags = "消费者 PostConsumer")
public class PostConsumer {


    @ApiModelProperty
    @PostMapping("/postConsumer")
    public String test(){
        return null;
    }

}
