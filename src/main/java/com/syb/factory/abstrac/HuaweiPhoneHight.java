package com.syb.factory.abstrac;

public class HuaweiPhoneHight implements HightPhone {
    @Override
    public void createHight() {
        System.out.println("生产华为高端手机");
    }
}
