package by.epam.chef.vegetables.rootcrops;

import by.epam.chef.vegetables.Vegetable;

public abstract class RootCrop extends Vegetable {
    private int depthInGround;

    public RootCrop(String name, double weight, int calories, int depthInGround) {
        super(name, weight, calories);
        this.depthInGround = depthInGround;
    }

    public int getDepthInGround() {
        return depthInGround;
    }

    public void setDepthInGround(int depthInGround) {
        this.depthInGround = depthInGround;
    }
}
