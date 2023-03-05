package com.acn.abstractFactoryPattern.chair;

public class ModernChair implements Chair{
    @Override
    public boolean hasLegs() {
        System.out.println("Modern chair has no legs");
        return false;
    }

    @Override
    public void fold() {
        System.out.println("Modern chair is foldable");
    }
}
