package com.liouwb.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author liouwb
 */
@Component
@FeignClient(value = "cloud-provider")
public interface ProviderService {

    @GetMapping("provider/get")
    String provider();
}
