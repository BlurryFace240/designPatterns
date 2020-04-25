package com.example.factory.demo;

import com.example.factory.demo.Factory.Creator.BaseCakeFactory;
import com.example.factory.demo.Factory.Creator.BasePizzaFactory;
import com.example.factory.demo.Factory.Creator.CakeFactory;
import com.example.factory.demo.Factory.Creator.PizzaFactory;
import com.example.factory.demo.Factory.Product.Cake;
import com.example.factory.demo.Factory.Product.Pizza;
import org.junit.jupiter.api.Test;

public class PizzaFactoryTest {

    @Test
    public void testMakePizzas(){
        BasePizzaFactory pizzaFactory = new PizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
        Pizza chiliePizza = pizzaFactory.createPizza("chili");
        BaseCakeFactory cakeFactory = new CakeFactory();
        Cake appleCake = cakeFactory.createCake("apple");
        Cake cherryCake = cakeFactory.createCake("cherry");
    }

}
