package com.hikvision.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @description（类描述）: 一句话描述该类的功能
 * @author（创建人）: user
 * @Date 2022/11/9 9:26
 */
@Configuration
public class RestTemplateConfig {

    @Bean
    public RestTemplate getBean() {
        return new RestTemplate();
    }
}
