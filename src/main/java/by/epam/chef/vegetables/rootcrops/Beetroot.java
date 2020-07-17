package by.epam.chef.vegetables.rootcrops;

public class Beetroot extends RootCrop {
    private int redColorLevel;

    public Beetroot(double weight, int redColorLevel) {
        super("Beetroot", weight, 43, 30);
        this.redColorLevel = redColorLevel;
    }

    public int getRedColorLevel() {
        return redColorLevel;
    }

    public void setRedColorLevel(int redColorLevel) {
        this.redColorLevel = redColorLevel;
    }
}
