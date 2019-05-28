package com.pgu.singleton.broken;

import com.pgu.singleton.lazy.LazyInnerClassSingleton;

import java.lang.reflect.Constructor;
//反射破坏单例Test
public class ReflectionBroken {

    public static void main(String[] args) {
        LazyInnerClassSingleton lazyInnerClassSingleton = LazyInnerClassSingleton.getInstance();
        Class clazz = LazyInnerClassSingleton.class;
        LazyInnerClassSingleton inner = null;
        try {
            Constructor constructor = clazz.getDeclaredConstructor(null);
            constructor.setAccessible(true);
            inner = (LazyInnerClassSingleton) constructor.newInstance();

            System.out.println(constructor.newInstance()==constructor.newInstance());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
