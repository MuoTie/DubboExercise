package com.dubbo.controller;

import com.dubbo.service.UserService;
import org.apache.dubbo.config.annotation.Reference;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class Controller {
    @Reference
    private UserService userService;
    @RequestMapping("sayHellooo")
    public String sayHello(){
        return userService.sayHello();
    }
}
