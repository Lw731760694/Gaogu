package com.pgu.singleton.register;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//容器化注册式单例
//spring ioc 就是用的这种模式
public class ContenSingleton {
    private static Map<String,Object> content = new ConcurrentHashMap<>();

    private ContenSingleton(){

    }

    private static Object getInstance(String className){
        if(!content.containsKey(className)){
            synchronized (content){
                if(!content.containsKey(className)){
                    try {
                        Class clazz = Class.forName(className);
                        content.put(className,clazz);
                        return clazz;
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                }else{
                    return content.get(className);
                }
            }
        }
        return  content.get(className);
    }
}
