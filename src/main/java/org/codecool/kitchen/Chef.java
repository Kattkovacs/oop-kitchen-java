package org.codecool.kitchen;

import java.util.Calendar;
import java.util.Random;

public class Chef extends Employee implements behaviorsWhileCooking {
    public Chef(String name, int birthDate, double salary, int numberOfKnives) {
        super(name, birthDate, salary, numberOfKnives);
    }

    public void requestIngredient(Ingredient ingredient) {
    }

    @Override
    public void cook() {
        System.out.println("I'm a chef, I can cook better then others.");
    }

    @Override
    public void shout() {
        System.out.println("I'm a chef, I can cook while I'm asking for ingredients.");
    }

    public void randomizeBehavior() {
        if (new Random().nextInt() < 0) {
            cook();
        } else {
            shout();
        }
    }
}