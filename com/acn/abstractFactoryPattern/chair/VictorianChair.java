package com.acn.abstractFactoryPattern.chair;

public class VictorianChair implements Chair{
    @Override
    public boolean hasLegs() {
        System.out.println("Victorian chair has  legs");
        return true;
    }

    @Override
    public void fold() {
        System.out.println("Victorian chair is non-foldable");
    }
}
