package com.nagarro.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class HelloWorldController {


    @GetMapping("/home")
    public String getString(){
        return "hello World !!";
    }
}
