package com.example.springbootadmineureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringbootAdminEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootAdminEurekaApplication.class, args);
    }

}
