package com.pgu.singleton.broken;

import com.pgu.singleton.lazy.LazyInnerClassSingleton;

import java.io.*;

//序列化破坏单例
public class SerializableBroken {

    public static void main(String[] args) {
        LazyInnerClassSingleton lazyInnerClassSingleton = LazyInnerClassSingleton.getInstance();
        LazyInnerClassSingleton lazyInnerClassSingleton1 = null;
        try {
            FileOutputStream out = new FileOutputStream("singleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(out);
            oos.writeObject(lazyInnerClassSingleton);
            oos.flush();
            oos.close();
            FileInputStream in = new FileInputStream("singleton.obj");
            ObjectInputStream oin = new ObjectInputStream(in);
            lazyInnerClassSingleton1 = (LazyInnerClassSingleton) oin.readObject();
            System.out.println(lazyInnerClassSingleton);
            System.out.println(lazyInnerClassSingleton1);
            System.out.println(lazyInnerClassSingleton==lazyInnerClassSingleton1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
