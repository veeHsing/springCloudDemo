package com.zhangwx.feign_consumer02.service;

import com.zhangwx.feign_consumer02.fallback.HelloServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "provider",fallbackFactory = HelloServiceFallbackFactory.class)
public interface HelloService {

    @RequestMapping("p/index")
    public String index();
}
