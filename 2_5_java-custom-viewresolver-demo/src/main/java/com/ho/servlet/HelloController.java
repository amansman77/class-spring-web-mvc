package com.ho.servlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    
    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Dispatch " + helloService.getName();
    }

    @GetMapping("/sample")
    public String sample() {
        return "/WEB-INF/sample.jsp";
    }

}
