package com.zhangwx;

import com.zhangwx.model.GitConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BasicConfigClientApplicationTests {

    @Autowired
    private GitConfig gitConfig;
    @Test
    void contextLoads() {
        System.out.println(gitConfig);


    }

}
