package com.vundr.eriko;

import com.vundr.eriko.security.configuration.EnableSecurityModule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableSecurityModule
@SpringBootApplication
public class ErikoApplicationStarter {

    public static void main(String[] args) {
        SpringApplication.run(ErikoApplicationStarter.class);
    }
}
