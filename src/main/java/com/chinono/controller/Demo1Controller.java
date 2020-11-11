package com.chinono.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo1Controller {

    @GetMapping("/test1")
    public String Test1(){
        return "hello";
    }
}
