package com.vundr.eriko.security.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Configuration
@Target({ElementType.TYPE})
@Import(SecurityConfig.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface EnableSecurityModule {
}
