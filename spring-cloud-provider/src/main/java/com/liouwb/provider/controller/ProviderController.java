package com.liouwb.provider.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liouwb
 */
@RestController
@RequestMapping("provider")
public class ProviderController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "get")
    @HystrixCommand(fallbackMethod = "hystrixCall")
    public String get() {
        double num = Math.random() * 10;
        if (num > 5) {
            throw new RuntimeException("provider出现异常");
        }
        return "这是一个provider服务,服务端口:" + serverPort;
    }

    @GetMapping(value = "hystrix_test")
    @HystrixCommand(fallbackMethod = "hystrixCall")
    public String hystrixTest() {
        double num = Math.random() * 10;
        if (num > 5) {
            throw new RuntimeException("provider出现异常");
        }

        return "这是一个provider服务,服务端口:" + serverPort;
    }

    public String hystrixCall(){

        return "@Hystrix:"+serverPort;
    }
}
