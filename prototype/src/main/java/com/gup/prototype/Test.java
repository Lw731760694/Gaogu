package com.gup.prototype;

public class Test {


    public static void main(String[] args) {

        try {
            Book clazz = Book.forName("com.gup.prototype.Student");
            clazz.getConstructors();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
