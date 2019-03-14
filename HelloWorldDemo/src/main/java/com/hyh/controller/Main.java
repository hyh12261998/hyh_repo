package com.hyh.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Demo class
 *
 * @author hyh
 * @date 2019/3/9
 */
public class Main {
    public static void main(String[] args){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
        HelloWorld helloWorld=(HelloWorld) ctx.getBean("helloworld");
        helloWorld.hello();
    }
}
