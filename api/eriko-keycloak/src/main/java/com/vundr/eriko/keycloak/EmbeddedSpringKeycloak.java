package com.vundr.eriko.keycloak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication(exclude = LiquibaseAutoConfiguration.class)
@EnableConfigurationProperties({KeycloakProperties.class, KeycloakCustomProperties.class})
public class EmbeddedSpringKeycloak {

    public static void main(String[] args) {
        SpringApplication.run(EmbeddedSpringKeycloak.class, args);
    }
}
