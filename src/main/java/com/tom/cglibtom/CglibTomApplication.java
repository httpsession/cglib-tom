package com.tom.cglibtom;

import com.tom.cglibtom.config.AppConfig;
import com.tom.cglibtom.config.TomConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CglibTomApplication {

    public static void main(String[] args){
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
        AppConfig appConfig=annotationConfigApplicationContext.getBean(AppConfig.class);
        System.out.println(appConfig);
    }
   /* public static void main(String[] args){
        Enhancer enhancer =new Enhancer();
        enhancer.setSuperclass(TomConfig.class);
        enhancer.setNamingPolicy(SpringNamingPolicy.INSTANCE);
        enhancer.setCallback(new TomInterceptor());
        TomConfig config  = (TomConfig) enhancer.create();
        config.userService();
    }*/

}

