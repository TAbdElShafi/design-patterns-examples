package com.acn.abstractFactoryPattern.sofa;


public class VictorianSofa implements Sofa {
    @Override
    public boolean hasLegs() {
        System.out.println("Victorian sofa has  legs");
        return true;
    }

    @Override
    public void fold() {
        System.out.println("Victorian sofa is non-foldable");
    }
}
