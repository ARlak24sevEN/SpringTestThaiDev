package com.example.springthaidevtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class HelloSpringBootController {

    @GetMapping("/hello-springboot")
    public String helloSpringboot(){
        return "Hello Spring boot rest api";
    }
}
