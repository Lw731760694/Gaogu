package com.gpao.proxy.JDKProxy;

import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StudentTest {

    public static void main(String[] args) {
        ClassProxy classProxy = new ClassProxy();
        Person student=(Person)classProxy.getInstance(new Student());
        student.eat();
        byte [] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
        FileOutputStream os = null;
        try {
            os = new FileOutputStream("$Proxy0.class");
            os.write(bytes);
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
