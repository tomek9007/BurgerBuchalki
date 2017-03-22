package com.tomek;

/**
 * Created by Tomek on 2017-02-28.
 */
public class DeluxBurger extends Hamburger {
    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add more items");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add more items");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add more items");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add more items");
    }

    public DeluxBurger() {
        super("Deluxe", "Sausage & Bacon", 14.54, "White");
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drink", 1.81);


    }
}
