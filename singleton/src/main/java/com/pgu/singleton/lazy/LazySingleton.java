package com.pgu.singleton.lazy;
//外部调用才实例化
public class LazySingleton {

    private  static LazySingleton lazySingleton = null;
    private LazySingleton(){}
    //线程过多的情况下CPU压力会很大会导致大量阻塞 从而导致性能会大幅度下降
    public synchronized static LazySingleton getInstance(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
