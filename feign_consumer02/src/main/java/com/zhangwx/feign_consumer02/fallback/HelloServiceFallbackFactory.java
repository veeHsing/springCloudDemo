package com.zhangwx.feign_consumer02.fallback;

import com.zhangwx.feign_consumer02.service.HelloService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceFallbackFactory implements FallbackFactory<HelloService> {

    @Override
    public HelloService create(Throwable throwable) {
        return new HelloService() {
            @Override
            public String index() {
                return "feign..service出现异常触发回调。。。"+throwable.getMessage();
            }
        };
    }
}
