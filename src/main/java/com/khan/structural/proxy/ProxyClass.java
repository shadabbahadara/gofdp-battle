package com.khan.structural.proxy;

public class ProxyClass {

    private RealClass realClass;
    private String realField;

    public ProxyClass() {
        realClass = new RealClass();
    }

    public void proxyMethod() {
        realClass.realMethod();
    }
}
