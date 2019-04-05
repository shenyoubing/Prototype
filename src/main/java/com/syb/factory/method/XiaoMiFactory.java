package com.syb.factory.method;

public class XiaoMiFactory implements Factory{
    @Override
    public Phone production() {
        return new XiaoMiPhone();
    }
}
