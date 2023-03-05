package com.acn.abstractFactoryPattern.factories;

import com.acn.abstractFactoryPattern.chair.Chair;
import com.acn.abstractFactoryPattern.sofa.Sofa;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
}
