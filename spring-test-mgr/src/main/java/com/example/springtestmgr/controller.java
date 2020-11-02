package com.example.springtestmgr;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String hello(){
        System.out.println("hello world!");
        return "hello world!";
    }
}
