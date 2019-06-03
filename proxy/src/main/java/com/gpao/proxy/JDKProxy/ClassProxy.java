package com.gpao.proxy.JDKProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ClassProxy implements InvocationHandler {
    public  Object object;
    public  Object getInstance(Object object){
            this.object = object;
             Class clazz = object.getClass();
            return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
       Object object1 =   method.invoke(object,args);
       after();
        return  object1;
    }

    private void after() {
        System.out.println("吃东西之后");
    }

    private void before(){
        System.out.println("吃东西之前");
    }
}
