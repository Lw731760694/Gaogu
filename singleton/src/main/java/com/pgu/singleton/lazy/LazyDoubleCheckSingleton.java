package com.pgu.singleton.lazy;

//双重检查单例模式
public class LazyDoubleCheckSingleton {
    private static LazyDoubleCheckSingleton lazyDoubleCheckSingleton=null;
    private LazyDoubleCheckSingleton(){

    }
//提前判断是否为NULL 多线程下能缓解一部分压力不必再同步块外面等待
    // 简单懒汉模式 和 双重检查懒汉式 都用到了synchronized 关键字 总是会上锁 所以性能还是有影响的
    public static LazyDoubleCheckSingleton getInstance(){
        if(lazyDoubleCheckSingleton!=null){
            synchronized (LazyDoubleCheckSingleton.class){
                if (lazyDoubleCheckSingleton!=null){
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return  lazyDoubleCheckSingleton;
    }
}
