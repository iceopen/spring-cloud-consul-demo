package org.iceinto.cloud.serviceclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
@EnableFeignClients
public class ServiceClientApplication {
    @Autowired
    AddClient client;

    @RequestMapping("/")
    public String add(@RequestParam Integer a, @RequestParam Integer b) {
        return client.add(a, b);
    }

    public static void main(String[] args) {
        SpringApplication.run(ServiceClientApplication.class, args);
    }

}

