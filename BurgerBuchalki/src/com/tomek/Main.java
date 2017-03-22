package com.tomek;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger=new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.12);
        System.out.println("Total Burger price is "+hamburger.itemizeHamburger());

        HealthBurger healthBurger=new HealthBurger("Bacon", 5.67);
        healthBurger.itemizeHamburger();
        healthBurger.addHamburgerAddition1("Egg", 5.43);
        healthBurger.addHealthAddition1("Lentils", 3.41);

        System.out.println("Total Healthy Burger price is "+healthBurger.itemizeHamburger());

        DeluxBurger db = new DeluxBurger();
        db.addHamburgerAddition1("No!",120);
        db.itemizeHamburger();





    }
}
