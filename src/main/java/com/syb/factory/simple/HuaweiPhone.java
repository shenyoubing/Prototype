package com.syb.factory.simple;

public class HuaweiPhone implements Phone {
    @Override
    public void create() {
        System.out.println("生产华为手机");
    }
}
