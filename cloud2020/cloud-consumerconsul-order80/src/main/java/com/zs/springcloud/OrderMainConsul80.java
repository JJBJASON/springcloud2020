package com.zs.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author jjb 2020/06/19 - 下午 4:32
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderMainConsul80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMainConsul80.class,args);
    }
}
