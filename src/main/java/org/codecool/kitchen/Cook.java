package org.codecool.kitchen;

import java.util.Calendar;

public class Cook extends Employee implements behaviorsWhileCooking{
    public Cook(String name, int birthDate, double salary, int numberOfKnives) {
        super(name, birthDate, salary, numberOfKnives);
    }

    @Override
    public void cook(){
        System.out.println("I'm a cook.");
    }

    @Override
    public void shout() {
        System.out.println("I'm cooking! Let me cook!");
    }
}
