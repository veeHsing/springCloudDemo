package com.zhangwx.consumer01.hystrix;

import com.netflix.hystrix.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

public class MyHystrixCommand extends HystrixCommand {

    @Autowired
    private RestTemplate restTemplate;

    public MyHystrixCommand(Setter setter,RestTemplate restTemplate) {
        super(setter);
        this.restTemplate=restTemplate;
    }

    @Override
    protected Object run() throws Exception {
        return restTemplate.getForEntity("http://provider/p/index",String.class).getBody();
    }


    @Override
    protected Object getFallback() {
        return "error";
    }
}
