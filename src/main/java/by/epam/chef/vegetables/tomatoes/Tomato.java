package by.epam.chef.vegetables.tomatoes;

public class Tomato extends Tomatoes {
    private String shape;

    public Tomato(double weight, String color, String shape) {
        super("Tomato", weight, 18, color);
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

}
