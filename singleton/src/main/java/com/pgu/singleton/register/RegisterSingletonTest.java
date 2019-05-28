package com.pgu.singleton.register;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class RegisterSingletonTest {



    public static void main(String[] args) {
        EnumSingleton enumSingleton =EnumSingleton.getInstance();
        enumSingleton.setData(new Object());
       // System.out.println(enumSingleton.getData());
       // System.out.println(EnumSingleton.INSTANCE);
        //System.out.println(EnumSingleton.INSTANCE1);
        Class clazz = EnumSingleton.class;
        try {
           Constructor constructor = clazz.getDeclaredConstructor(String.class,int.class);
           constructor.setAccessible(true);
            constructor.newInstance();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        try {
            FileOutputStream fos = new FileOutputStream("obj.class");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(enumSingleton);
            oos.flush();
            oos.close();
            FileInputStream fis = new FileInputStream("obj.class");
            ObjectInputStream ois = new ObjectInputStream(fis);
            EnumSingleton eum = (EnumSingleton)ois.readObject();
            System.out.println(eum);
            System.out.println(enumSingleton.getData()==eum.getData());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
