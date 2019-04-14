package com.smart.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController                         //spring mvc提供用于Rest服务
@EnableAutoConfiguration                //由Boot提供，用于对Spring框架的自我配置
public class BbsDaemon {

    @RequestMapping("/")                //spring mvc提供用于Rest服务
    public String index(){
        return "欢迎光临小春论坛！";
    }

    public static void main(String[] args){
        SpringApplication.run(BbsDaemon.class,args);
    }
}
