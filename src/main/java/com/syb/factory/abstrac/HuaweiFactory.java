package com.syb.factory.abstrac;

public class  HuaweiFactory implements Factory{

    @Override
    public LowPhone productionlow() {
        return new HuaweiPhoneLow();
    }

    @Override
    public HightPhone productionhight() {
        return new HuaweiPhoneHight();
    }
}
