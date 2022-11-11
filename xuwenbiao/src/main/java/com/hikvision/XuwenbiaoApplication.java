package com.hikvision;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.hikvision.mapper")//mybatis plus 扫描
public class XuwenbiaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(XuwenbiaoApplication.class, args);
    }

}

