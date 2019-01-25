package com.tom.cglibtom;

import com.tom.cglibtom.config.AppConfig;
import com.tom.cglibtom.config.JackConfig;
import com.tom.cglibtom.config.TomConfig;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ConfigurationClassPostProcessor;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

public class CglibTomApplication {
    public static void main(String[] args){
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
        AppConfig appConfig=annotationConfigApplicationContext.getBean(AppConfig.class);
        JackConfig jackConfig=annotationConfigApplicationContext.getBean(JackConfig.class);
        System.out.println(appConfig);
        System.out.println(jackConfig);
    }

    /**
     *  //org.springframework.context.annotation.ConfigurationClassEnhancer configurationClassEnhancer;
     *
     *        // ConfigurationClassPostProcessor
     *      /*   WebApplicationContext c;
     *         XmlWebApplicationContext l;
     *         BeanDefinition d;*/

   /* public static void main(String[] args){
        Enhancer enhancer =new Enhancer();
        enhancer.setSuperclass(TomConfig.class);
        enhancer.setNamingPolicy(SpringNamingPolicy.INSTANCE);
        enhancer.setCallback(new TomInterceptor());
        TomConfig config  = (TomConfig) enhancer.create();
        config.userService();
    }*/

}

