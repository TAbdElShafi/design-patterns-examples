package com.acn.abstractFactoryPattern.sofa;


public class ModernSofa implements Sofa {
    @Override
    public boolean hasLegs() {
        System.out.println("Modern sofa has no legs");
        return false;
    }

    @Override
    public void fold() {
        System.out.println("Modern sofa is foldable");
    }
}
