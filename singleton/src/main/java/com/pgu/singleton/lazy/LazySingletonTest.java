package com.pgu.singleton.lazy;

public class LazySingletonTest {

    public static void main(String[] args) {
        LazySingletonThread thread = new LazySingletonThread();
        new Thread(thread).start();
        new Thread(thread).start();
    }
}
