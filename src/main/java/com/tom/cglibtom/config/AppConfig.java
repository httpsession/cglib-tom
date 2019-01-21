package com.tom.cglibtom.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
@ComponentScan("com.tom.cglibtom")
public class AppConfig {
    @Bean
    public JackConfig jackConfig(){
        System.out.println("create a JackConfig instance");
        return new JackConfig();
    }

    @Bean
    public TomConfig tomConfig(){
        jackConfig();
        System.out.println("create a TomConfig instance");
        return new TomConfig();
    }
}
