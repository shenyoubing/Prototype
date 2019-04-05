package com.syb.factory.simple;

public class XiaoMiPhone implements Phone {
    @Override
    public void create() {
        System.out.println("生产小米手机");
    }
}
