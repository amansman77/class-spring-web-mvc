package com.ho.servlet;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String getName() {
        return "Service bean name";
    }
    
}
