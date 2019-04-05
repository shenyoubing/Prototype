package com.syb.factory.simple;

public class SimpleTest {

    public static void main(String[] args) {
        Factory factory = new Factory();
        Phone phone = factory.production(HuaweiPhone.class);
        phone.create();
    }

}
