package builder.model;

import builder.item.Burger;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public double price() {
        return 25.0f;
    }
}
