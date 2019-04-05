package com.syb.factory.abstrac;
public class XiaoMiFactory implements Factory{

    @Override
    public LowPhone productionlow() {
        return new XiaoMiPhoneLow();
    }

    @Override
    public HightPhone productionhight() {
        return new XiaoMiPhoneHight();
    }
}
