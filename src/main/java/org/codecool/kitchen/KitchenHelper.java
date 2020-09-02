package org.codecool.kitchen;

import java.util.HashMap;

import java.util.Map;
import java.util.Random;

public class KitchenHelper extends Employee{
    private Map<Ingredient, Integer> ingredients = new HashMap<>();;

    public KitchenHelper(String name, int birthDate, double salary,
                         int numberOfKnives) {
        super(name, birthDate, salary, numberOfKnives);
    }

    public void updateIngredients() {
        Random random = new Random();
        System.out.println(random.nextInt(4));
        ingredients.put (Ingredient.CARROT, random.nextInt(4));
        ingredients.put (Ingredient.MEAT, random.nextInt(4));
        ingredients.put (Ingredient.POTATO, random.nextInt(4));
    }

    public void giveIngredient() {
        ingredients.remove(ingredients.size()-1);
    }

}
