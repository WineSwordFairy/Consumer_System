package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    @Value("${test.url}")
    private String testUrl;


    @RequestMapping("/Home")
    public String index() {

        return "Welcome To ConsumerSystem!";
    }
}
