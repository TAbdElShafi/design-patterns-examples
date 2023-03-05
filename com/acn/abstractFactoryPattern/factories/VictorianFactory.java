package com.acn.abstractFactoryPattern.factories;

import com.acn.abstractFactoryPattern.chair.Chair;
import com.acn.abstractFactoryPattern.chair.VictorianChair;
import com.acn.abstractFactoryPattern.sofa.Sofa;
import com.acn.abstractFactoryPattern.sofa.VictorianSofa;

public class VictorianFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}
