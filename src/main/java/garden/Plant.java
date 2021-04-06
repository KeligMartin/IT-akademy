package garden;

public class Plant {

    private String name;
    private double size;
    private boolean isEdible;

    public Plant(String name, double size, boolean isEdible) {
        this.name = name;
        this.size = size;
        this.isEdible = isEdible;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public boolean isEdible() {
        return isEdible;
    }

    public void setEdible(boolean edible) {
        isEdible = edible;
    }
}
