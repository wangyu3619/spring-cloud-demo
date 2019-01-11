package com.example.account.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangyu
 * 2019/01/11 23:26
 */
@RestController
@RequestMapping("hello")
public class HomeController {

    @RequestMapping("hello")
    public String hello(){
        return "Hello From  SpringCloud!";
    }
}
