package com.example.account.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wangyu
 * 2019/01/14 23:13
 */
@FeignClient(serviceId="order")
public interface OrderFeignService {
    @RequestMapping("home/hello")
    String hello();
}
