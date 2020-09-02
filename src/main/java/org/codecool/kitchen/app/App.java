package org.codecool.kitchen.app;

import org.codecool.kitchen.*;

import java.util.ArrayList;
import java.util.List;


public class App
{
    public static void main( String[] args )
    {
        Chef chef = new Chef("BossMan", 1988, 100, 0);
        List<Cook> cooks = new ArrayList<>();
        cooks.add(new Cook("Joe", 1975,20, 0));
        cooks.add(new Cook("Deer", 1978,30, 0));
        List<KitchenHelper> kitchenHelpers = new ArrayList<>();
        kitchenHelpers.add(new KitchenHelper("Helpy", 1978,15, 0));
        kitchenHelpers.add(new KitchenHelper("Helpy2", 1978,15, 0));
        kitchenHelpers.add(new KitchenHelper("Helpy3", 1978,15, 0));
        kitchenHelpers.add(new KitchenHelper("Helpy4", 1978,15, 0));
        for (KitchenHelper kitchenHelper : kitchenHelpers) {
            kitchenHelper.updateIngredients();
        }
        Restaurant restaurant = new Restaurant();
        restaurant.hireChef(chef);
        restaurant.hireCook(cooks);
        restaurant.hireKitchenHelper(kitchenHelpers);
        for (Cook cook : cooks) {
            cook.cook();
            cook.shout();
        }
        chef.cook();
        chef.shout();
    }
}
