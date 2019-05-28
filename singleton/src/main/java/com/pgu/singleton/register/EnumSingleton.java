package com.pgu.singleton.register;

public enum  EnumSingleton {
    INSTANCE,INSTANCE1;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
