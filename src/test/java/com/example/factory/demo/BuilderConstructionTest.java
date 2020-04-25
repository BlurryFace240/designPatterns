package com.example.factory.demo;

import com.example.factory.demo.Builder.Builders.ConcreteHouseBuilder;
import com.example.factory.demo.Builder.Builders.HouseBuilder;
import com.example.factory.demo.Builder.Builders.PrefabricatedHouseBuilder;
import com.example.factory.demo.Builder.Construction;
import com.example.factory.demo.Builder.Model.House;
import org.junit.jupiter.api.Test;

public class BuilderConstructionTest {
    @Test
    public void testConstructHouse() throws Exception {
        HouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();
        Construction engineerA = new Construction(concreteHouseBuilder);
        House houseA = engineerA.constructHouse();
        System.out.println("House is: " + houseA);
        PrefabricatedHouseBuilder prefabricatedHouseBuilder = new PrefabricatedHouseBuilder();
        Construction engineerB = new Construction(prefabricatedHouseBuilder);
        House houseB = engineerB.constructHouse();
        System.out.println("House is: " + houseB);
    }

}
