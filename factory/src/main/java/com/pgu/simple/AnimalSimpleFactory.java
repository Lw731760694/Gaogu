package com.pgu.simple;

public class AnimalSimpleFactory {

    public  Animal create(Class<? extends Animal> clazz){

        try {
            if(clazz!=null) {
                return clazz.newInstance();
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
