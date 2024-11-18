package com.playdata.orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class OrderserviceBack202410Application {

    public static void main(String[] args) {
        SpringApplication.run(OrderserviceBack202410Application.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "the server is running";
    }

}
