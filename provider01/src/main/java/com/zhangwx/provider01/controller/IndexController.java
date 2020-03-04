package com.zhangwx.provider01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("/p/index")
    public String index(){
        int a = 10 / 0;
        return "provider-01-success";
    }
}
