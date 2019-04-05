package com.syb.factory.simple;

public class Factory  {

    public Phone production(Class clz){
        if(XiaoMiPhone.class == clz){
            return new XiaoMiPhone();
        }else if(HuaweiPhone.class == clz){
            return new HuaweiPhone();
        }
        return null;
    }

}
