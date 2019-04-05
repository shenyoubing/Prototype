package com.syb.factory.abstrac;

public class XiaoMiPhoneLow implements LowPhone {
    @Override
    public void createLowEnd() {
        System.out.println("生产小米低端手机");
    }
}
