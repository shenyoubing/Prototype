package com.syb.factory.method;

public class  HuaweiFactory implements Factory{
    @Override
    public Phone production() {

        return new HuaweiPhone();
    }
}
