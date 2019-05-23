package com.pgu.abstractFactory;

public class YouAnimalFactory implements AnimalAbstractFactory {
    @Override
    public Cat createCat() {
        return new YouCat();
    }

    @Override
    public Dog createDog() {
        return new YouDog();
    }
}
