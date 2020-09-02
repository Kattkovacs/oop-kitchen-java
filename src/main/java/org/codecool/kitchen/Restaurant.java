package org.codecool.kitchen;


import java.util.List;

public class Restaurant {
    private Chef chef;
    private List<KitchenHelper> kitchenHelpers;
    private List<Cook> cooks;

    public void hireChef(Chef chef) {
        this.chef = chef;
    }

    public void hireCook(List<Cook> cooks) {
        this.cooks = cooks;
    }

    public void hireKitchenHelper(List<KitchenHelper> kitchenHelpers) {
        this.kitchenHelpers = kitchenHelpers;
    }
}
