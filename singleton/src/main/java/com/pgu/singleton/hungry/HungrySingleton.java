package com.pgu.singleton.hungry;
//饿汉单例
public class HungrySingleton {
    //用静态块一样可以实现饿汉模式
    private static final HungrySingleton hungrySingleton = new HungrySingleton();
    private HungrySingleton(){}
    /*
    * private static final HungrySingleton hungrySingleton；
    *{
    * hungrySingleton = new HungrySingleton();
    * }
    * */
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
