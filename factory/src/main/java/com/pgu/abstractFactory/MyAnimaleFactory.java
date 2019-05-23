package com.pgu.abstractFactory;

public class MyAnimaleFactory implements AnimalAbstractFactory {
    @Override
    public Cat createCat() {
        return new MyCat();
    }

    @Override
    public Dog createDog() {
        return new MyDog();
    }
}
