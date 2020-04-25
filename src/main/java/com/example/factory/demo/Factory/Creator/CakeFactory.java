package com.example.factory.demo.Factory.Creator;

import com.example.factory.demo.Factory.Product.AppleCake;
import com.example.factory.demo.Factory.Product.Cake;
import com.example.factory.demo.Factory.Product.CherryCake;

public class CakeFactory implements BaseCakeFactory {
    @Override
    public Cake createCake(String type) {
        Cake cake;
        switch (type) {
            case "apple" :
                cake = new AppleCake();
                break;
            case "cherry":
                cake = new CherryCake();
                break;
            default:
                throw new IllegalArgumentException("no such cake");
        }
        cake.bakeCake();
        return cake;
    }
}
