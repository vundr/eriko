package com.vundr.eriko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@SpringBootApplication
public class ErikoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ErikoApplication.class, args);
    }
}
