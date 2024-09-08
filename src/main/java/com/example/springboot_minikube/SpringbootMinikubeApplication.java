package com.example.springboot_minikube;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example")
public class SpringbootMinikubeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMinikubeApplication.class, args);
    }
}
