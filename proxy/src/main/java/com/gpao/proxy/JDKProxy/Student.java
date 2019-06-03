package com.gpao.proxy.JDKProxy;

import com.gpao.proxy.JDKProxy.Person;

public class Student implements Person {

    private String name;
    private int age;

    public Student(){

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void study(){
        System.out.println("学生学习");
    }

    @Override
    public void eat() {
        System.out.println("吃东西");
    }
}
