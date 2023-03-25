package com.dubbo.service.impl;

import com.dubbo.service.UserService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String sayHello() {
        return "hello dubbo~";
    }
}
