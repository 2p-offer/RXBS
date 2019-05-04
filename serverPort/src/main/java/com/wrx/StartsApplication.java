package com.wrx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @Author: wangyan
 * @Date: 2019/5/4
 */
@SpringBootApplication
@ServletComponentScan
@MapperScan("com.wrx.dao")

public class StartsApplication {
    public static void main(String[] args) {
        SpringApplication.run(StartsApplication.class, args);
    }
}
