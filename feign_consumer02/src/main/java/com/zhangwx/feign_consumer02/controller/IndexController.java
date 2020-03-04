package com.zhangwx.feign_consumer02.controller;

import com.zhangwx.feign_consumer02.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {


    @Autowired
    private HelloService helloService;

    @RequestMapping("f/index")
    public String index(){
        return "";
    }

    @RequestMapping("f/index2")
    public String index2(){
        return helloService.index();
    }
}
