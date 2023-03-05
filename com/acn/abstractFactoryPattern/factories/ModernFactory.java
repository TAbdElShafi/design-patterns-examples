package com.acn.abstractFactoryPattern.factories;

import com.acn.abstractFactoryPattern.chair.Chair;
import com.acn.abstractFactoryPattern.chair.ModernChair;
import com.acn.abstractFactoryPattern.sofa.ModernSofa;
import com.acn.abstractFactoryPattern.sofa.Sofa;

public class ModernFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
