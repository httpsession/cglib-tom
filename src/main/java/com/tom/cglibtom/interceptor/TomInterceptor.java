package com.tom.cglibtom.interceptor;


import org.aopalliance.intercept.MethodInvocation;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
public class TomInterceptor implements MethodInterceptor , PriorityOrdered {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("do something interesting");
        return methodProxy.invokeSuper(o,objects);
    }

    @Override
    public int getOrder() {
        return -1;
    }
}

