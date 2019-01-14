package com.example.account.controller;

import com.example.account.service.OrderFeignService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wangyu
 * 2019/01/11 23:26
 */
@RestController
@RequestMapping("home")
public class HomeController {

    @Resource
    private OrderFeignService orderFeignService;

    @RequestMapping("hello")
    public String hello(){
        return "Hello From  Account!";
    }

    @RequestMapping("feign")
    public String feign(){
        return orderFeignService.hello();
    }
}
