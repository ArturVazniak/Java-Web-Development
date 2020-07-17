package by.epam.chef.vegetables.tomatoes;

public class Pepper extends Tomatoes {
    private int spicyLevel;

    public Pepper(double weight, String color, int spicyLevel) {
        super("Pepper", weight, 40, color);
        this.spicyLevel = spicyLevel;
    }

    public int getSpicyLevel() {
        return spicyLevel;
    }

    public void setSpicyLevel(int spicyLevel) {
        this.spicyLevel = spicyLevel;
    }

}
