package com.zhangwx.feign_consumer02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignConsumer02Application {

    public static void main(String[] args) {
        SpringApplication.run(FeignConsumer02Application.class, args);
    }

}
