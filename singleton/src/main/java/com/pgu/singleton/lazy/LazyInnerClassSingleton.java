package com.pgu.singleton.lazy;


import java.io.Serializable;

//使用静态内部类的懒加载单例模式
//静态内部类只有外面加载时才会实例化
public class LazyInnerClassSingleton  implements Serializable{

    private LazyInnerClassSingleton(){
        //防止通过反射实例化构建对象 在其构造方法中加入判断防止反射实例化
        /*
        虽然，增加 readResolve()方法返回实例，解决了单
例被破坏的问题。但是，我们通过分析源码以及调试，我们可以看到实际上实例化了两
次，只不过新创建的对象没有被返回而已。那如果，创建对象的动作发生频率增大，就
意味着内存分配开销也就随之增大
         */
        if(LazyInner.lazyInnerClassSingleton!=null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }
    //新增readResolve组织序列化生成实例
    private  Object readResolve(){
        return LazyInner.lazyInnerClassSingleton;
    }
    //默认使用 LazyInner 的时候，会先初始化内部类
    //如果没使用的话，内部类是不加载的
    //每个关键字都不是多余的
    //static 是使单例的空间共享
    //final是方法不被重写
    public static final LazyInnerClassSingleton getInstance()  {

        return LazyInner.lazyInnerClassSingleton;
    }
    private static class LazyInner{
        private static final LazyInnerClassSingleton lazyInnerClassSingleton = new LazyInnerClassSingleton();

    }

}
