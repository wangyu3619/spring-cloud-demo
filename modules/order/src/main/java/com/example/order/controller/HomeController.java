package com.example.order.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangyu
 * 2019/01/11 23:26
 */
@RestController
@RequestMapping("home")
public class HomeController {

    @RequestMapping("hello")
    public String hello(){
        return "Hello From  Order!";
    }

}
