package by.epam.chef.vegetables.tomatoes;

import by.epam.chef.vegetables.Vegetable;

public abstract class Tomatoes extends Vegetable {
    private String color;

    public Tomatoes(String name, double weight, int calories, String color) {
        super(name, weight, calories);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
