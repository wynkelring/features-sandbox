package com.solid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeaturesSandboxApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeaturesSandboxApplication.class, args);
    }

}
