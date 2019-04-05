package com.syb.factory.method;

public class MethodTest {

    public static void main(String[] args) {
        Factory factory = new HuaweiFactory();
        Phone phone = factory.production();
        phone.create();
    }
}
