package com.pgu.singleton.lazy;

public class LazySingletonThread implements Runnable {
    public void run() {
        System.out.println(LazySingleton.getInstance());
    }
}
