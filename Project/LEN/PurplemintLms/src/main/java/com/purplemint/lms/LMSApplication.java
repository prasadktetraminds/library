package com.purplemint.lms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by mmalyala on 10/1/2017.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class LMSApplication {

    public static void main(String[] args) {
        SpringApplication.run(LMSApplication.class, args);
    }

}
