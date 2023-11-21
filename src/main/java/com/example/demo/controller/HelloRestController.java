package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
    @RequestMapping("/hi")
    public String hi(){
        return "hi RestController로 들어온 페이지 입니다.";
    }
}
