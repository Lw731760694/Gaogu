package com.gup.prototype;

public class Student extends Person implements Cloneable{
    private Book book;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
