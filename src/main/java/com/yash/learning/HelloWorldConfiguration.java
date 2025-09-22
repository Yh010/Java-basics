package com.yash.learning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {
};

// config for spring
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Yash";
    }

    @Bean
    public int age() {
        return 10;
    }

    @Bean
    public Person person() {
        var person = new Person("rajesh", 10);
        return person;
    }

    @Bean
    public Person personToMethodCall() {
        var person = new Person(name(), age());
        return person;
    }
}
