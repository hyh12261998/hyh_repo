package com.hyh.controller;

/**
 * Demo class
 *
 * @author hyh
 * @date 2019/3/9
 */
public class HelloWorld {

    public String name;

    public void setName(String name){
        this.name=name;
    }

    public void hello(){
        System.out.print("hello:"+name);
    }
}
