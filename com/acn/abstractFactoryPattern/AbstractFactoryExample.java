package com.acn.abstractFactoryPattern;

import com.acn.abstractFactoryPattern.app.AppInterface;

public class AbstractFactoryExample {

    public static void main(String[] args) {
        AppInterface app = AppInterface.BuildInstance("Victorian");
        app.showFurnitureSpecs();
    }
}
