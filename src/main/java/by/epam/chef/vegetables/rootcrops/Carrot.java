package by.epam.chef.vegetables.rootcrops;

public class Carrot extends RootCrop {
    private int sweetLevel;

    public Carrot(double weight, int sweetLevel) {
        super("Carrot", weight, 35, 20);
        this.sweetLevel = sweetLevel;
    }

    public int getSweetLevel() {
        return sweetLevel;
    }

    public void setSweetLevel(int sweetLevel) {
        this.sweetLevel = sweetLevel;
    }
}
