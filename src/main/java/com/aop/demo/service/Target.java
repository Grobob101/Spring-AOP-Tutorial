package com.aop.demo.service;

import org.springframework.stereotype.Component;

/**
 * @Author: yewei
 * @CreateTime: 2024-08-09
 * @Description: 一个目标类
 * @Version: 1.0
 */

@Component
public class Target {
    public void helloAfter(){
        System.out.println("hello");
    }

    public void helloBefore(){
        System.out.println("hello");
    }

    public void helloAround(){
        System.out.println("hello");
    }
    public void helloAfterReturn(){
        System.out.println("hello");
    }
    public void helloAfterThrow(){
        try{
            int i=1/0;
        }catch(ArithmeticException e){
            System.out.println("ArithmeticException");
        }
    }
}
