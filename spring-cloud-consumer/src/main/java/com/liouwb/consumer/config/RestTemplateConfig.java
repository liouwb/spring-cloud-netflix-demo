package com.liouwb.consumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author liouwb
 */
@Configuration
public class RestTemplateConfig {
    @Bean
//    @LoadBalanced  // ribbon负载均衡
    public RestTemplate restTemplate() {

        return new RestTemplate();
    }
}
