package com.zhangwx.consumer01.controller;

import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zhangwx.consumer01.hystrix.MyHystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class IndexController {

    @Autowired
    @LoadBalanced
    private RestTemplate restTemplate ;


    @RequestMapping("c/index")
    @HystrixCommand(fallbackMethod = "err")
    public String index(){
        String info = restTemplate.getForEntity("http://provider/p/index",String.class).getBody();
//        int a = 10/0;
        return "调用provider成功："+info;
    }

    public String err(Throwable throwable){
//        System.out.println(throwable.getMessage());
        return "发生熔断"+throwable.getMessage();
    }


    @RequestMapping("c/index2")
    public String index2(){
        MyHystrixCommand myHystrixCommand=new MyHystrixCommand(com.netflix.hystrix.HystrixCommand.Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey("")),restTemplate);
        String str = (String) myHystrixCommand.execute();
        return  str;
    }
}
