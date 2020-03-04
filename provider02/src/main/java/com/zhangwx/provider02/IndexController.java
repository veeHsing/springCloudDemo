package com.zhangwx.provider02;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("p/index")
    public String index(){
        return "provider-02-server...";
    }
}
