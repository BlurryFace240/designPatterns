package com.example.factory.demo.Factory.Creator;

import com.example.factory.demo.Factory.Product.Cake;

public interface BaseCakeFactory {
    public Cake createCake(String type);
}
