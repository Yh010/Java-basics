package com.yash.learning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//config for spring
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Yash";
    }
}
