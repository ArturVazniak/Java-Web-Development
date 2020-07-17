package by.epam.chef;

import by.epam.chef.vegetables.Vegetable;

import java.util.ArrayList;
import java.util.List;

public class Salad {
    private String name;
    private List<Vegetable> vegetables;

    public Salad(String name) {
        this.name = name;
        this.vegetables = new ArrayList<>();
    }

    public void addVegetable(Vegetable vegetable) {
        this.vegetables.add(vegetable);
    }

    public int getCalories() {
        int calories = 0;

        for (Vegetable vegetable : vegetables) {
            calories += vegetable.getCalories() * vegetable.getWeight();
        }

        return calories;
    }

    public List<Vegetable> getMatchingVegetables(int minCalories, int maxCalories) {
        List<Vegetable> matchingVegetables = new ArrayList<>();

        for (Vegetable vegetable : this.vegetables) {
            int calories = vegetable.getCalories();

            if (calories >= minCalories && calories <= maxCalories) {
                matchingVegetables.add(vegetable);
            }
        }

        return matchingVegetables;
    }

    public List<Vegetable> getVegetables() {
        return vegetables;
    }
}
