package by.epam.chef;

import by.epam.chef.vegetables.Vegetable;
import by.epam.chef.vegetables.rootcrops.Carrot;
import by.epam.chef.vegetables.tomatoes.Pepper;
import by.epam.chef.vegetables.tomatoes.Tomato;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Salad salad = new Salad("Salad for Artur");

        salad.addVegetable(new Tomato(200, "Red", "Circle"));
        salad.addVegetable(new Pepper(300, "Yellow", 3));
        salad.addVegetable(new Carrot(20, 6));

        List<Vegetable> vegetables = salad.getVegetables();

        System.out.println(vegetables);
        System.out.println(salad.getCalories());

        vegetables.sort(new Comparator<Vegetable>() {
            @Override
            public int compare(Vegetable o1, Vegetable o2) {
                return (int) (o1.getWeight() - o2.getWeight());
            }
        });

        System.out.println(vegetables);

        System.out.println(salad.getMatchingVegetables(10, 35));
    }
}
