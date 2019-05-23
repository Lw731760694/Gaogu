package com.pgu.method;

public class CatFactory implements AnimalFactory {
    @Override
    public Animal create() {
        return new Cat();
    }
}
