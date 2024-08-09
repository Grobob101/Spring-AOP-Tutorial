package com.aop.demo.aspect;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Author: yewei
 * @CreateTime: 2024-08-09
 * @Description: 一个切面类
 * @Version: 1.0
 */

@Aspect
@Component
public class MyService {
    @Pointcut("execution(void com.aop.demo.service.Target.helloAround())")
    public void helloAround() {}

    @Before("execution(void com.aop.demo.service.Target.helloBefore())")
    public void before() {
        System.out.println("MyService叠加Buffer");
        System.out.println("MyService叠加Buffer");
        System.out.println("MyService叠加Buffer");
        System.out.println("MyService叠加Buffer");
    }

    @After("execution(void com.aop.demo.service.Target.helloAfter())")
    public void after() {
        System.out.println("MyService叠加Buffer");
        System.out.println("MyService叠加Buffer");
        System.out.println("MyService叠加Buffer");
        System.out.println("MyService叠加Buffer");
    }
    @Around("helloAround()")
    public void doSomething(ProceedingJoinPoint pjp) throws Throwable {

        System.out.println("MyService叠加Buffer");
        System.out.println("MyService叠加Buffer");
        pjp.proceed();
        System.out.println("MyService叠加Buffer");
        System.out.println("MyService叠加Buffer");
    }
}
