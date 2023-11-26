package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariableController {
    @RequestMapping("/path/{name}")
    public String pathVariable(@PathVariable("name") String userName) {
        return "PathVariable 연습 name : " + userName;
    }
    @RequestMapping("/pathV2/{name}")
    public String pathVariableV2(@PathVariable String name) {
        return "PathVariable 연습 name : " + name;
    }

    @RequestMapping("/path/{name}/{age}")
    public String pathVariableV3(@PathVariable String name, @PathVariable int age) {
        return "PathVariable 다중 연습 name : " + name + " age : " + age;
    }
}
