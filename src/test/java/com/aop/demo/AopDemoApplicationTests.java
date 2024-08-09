package com.aop.demo;

import com.aop.demo.service.Target;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AopDemoApplicationTests {
    @Resource
    Target target;

    @Test
    void contextLoads() {
        target.helloAround();
    }

}
