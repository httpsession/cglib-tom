package com.tom.cglibtom.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@ComponentScan("com.tom.cglibtom")
@Configuration
public class AppConfig {
    public AppConfig(){
        System.out.println("create a AppConfig instance");
    }
    @Bean
    public JackConfig jackConfig(){
        System.out.println("create a JackConfig instance");
        noBeanMethod();//noBeanMethod()未被@Bean修饰，不进行拦截
        return new JackConfig();
    }

    @Bean
    public TomConfig tomConfig(){
        System.out.println("do something interesting!");
        jackConfig();//jackConfig()被@Bean修饰，拦截！
        System.out.println("create a TomConfig instance");
        return new TomConfig();
    }

    public  JackConfig noBeanMethod(){
        return new JackConfig();
    }
}
