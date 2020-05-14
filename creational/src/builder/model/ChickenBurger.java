package builder.model;

import builder.item.Burger;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger ";
    }

    @Override
    public double price() {
        return 50.0f;
    }
}
