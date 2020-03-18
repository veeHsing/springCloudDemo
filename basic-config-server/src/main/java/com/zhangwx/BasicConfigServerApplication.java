package com.zhangwx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BasicConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasicConfigServerApplication.class, args);
    }

}
