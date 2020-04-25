package com.example.factory.demo.Builder;

import com.example.factory.demo.Builder.Builders.HouseBuilder;
import com.example.factory.demo.Builder.Model.House;

public class Construction {
    private HouseBuilder houseBuilder;

    public Construction(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse() {
        this.houseBuilder.buildFoundation();
        this.houseBuilder.buildStructure();
        this.houseBuilder.buildRoof();
        this.houseBuilder.paintHouse();
        this.houseBuilder.furnishHouse();
        return this.houseBuilder.getHouse();
    }

}
