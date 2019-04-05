package com.syb.factory.abstrac;

public class HuaweiPhoneLow implements LowPhone {
    @Override
    public void createLowEnd() {
        System.out.println("生产华为低端手机");
    }
}
