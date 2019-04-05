package com.syb.factory.abstrac;

public class abstractTest {

    public static void main(String[] args) {
        Factory factory = new HuaweiFactory();
        LowPhone phone = factory.productionlow();
        phone.createLowEnd();
    }
}
