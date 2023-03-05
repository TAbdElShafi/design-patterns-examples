package com.acn.abstractFactoryPattern.app;

import com.acn.abstractFactoryPattern.chair.Chair;
import com.acn.abstractFactoryPattern.factories.FurnitureFactory;
import com.acn.abstractFactoryPattern.factories.ModernFactory;
import com.acn.abstractFactoryPattern.factories.VictorianFactory;
import com.acn.abstractFactoryPattern.sofa.Sofa;

public class AppInterface {
    private Chair chair;
    private Sofa sofa;

    private AppInterface(FurnitureFactory furnitureFactory) {
        chair = furnitureFactory.createChair();
        sofa = furnitureFactory.createSofa();
    }

    public static AppInterface BuildInstance(String requestedStyle) {
        AppInterface appInterface;
        FurnitureFactory furnitureFactory;

        if (requestedStyle.equalsIgnoreCase("modern")) {
            furnitureFactory = new ModernFactory();
        } else {
            furnitureFactory = new VictorianFactory();
        }
        appInterface = new AppInterface(furnitureFactory);
        return appInterface;
    }

    public void showFurnitureSpecs() {
        chair.fold();
        chair.hasLegs();

        sofa.fold();
        sofa.hasLegs();
    }

}
