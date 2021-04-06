package garden;

public class Flower extends Plant{

    private Color color;
    private int nbPetals;

    public Flower(String name, double size, boolean isEdible, Color color, int nbPetals) {
        super(name, size, isEdible);
        this.color = color;
        this.nbPetals = nbPetals;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getNbPetals() {
        return nbPetals;
    }

    public void setNbPetals(int nbPetals) {
        this.nbPetals = nbPetals;
    }
}
