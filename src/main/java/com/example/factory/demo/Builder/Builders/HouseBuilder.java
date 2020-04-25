package com.example.factory.demo.Builder.Builders;

import com.example.factory.demo.Builder.Model.House;

public interface HouseBuilder {
    void buildFoundation();

    void buildStructure();

    void buildRoof();

    void paintHouse();

    void furnishHouse();

    House getHouse();
}
