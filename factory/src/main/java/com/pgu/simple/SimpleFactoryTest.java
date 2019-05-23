package com.pgu.simple;

public class SimpleFactoryTest {

    public static void main(String[] args) {
        AnimalSimpleFactory animalSimpleFactory = new AnimalSimpleFactory();
        Animal animal = animalSimpleFactory.create(Dog.class);
        animal.eat();
    }
}
