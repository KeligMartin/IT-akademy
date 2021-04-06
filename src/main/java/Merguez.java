public class Merguez extends Sausage{

    int spiciness;

    public Merguez(double length, double diameter, Meat meat, int spiciness){
        super(length, diameter, meat);
        this.spiciness = spiciness;
    }

    public int getSpiciness() {
        return spiciness;
    }

    public void setSpiciness(int spiciness) {
        this.spiciness = spiciness;
    }

    @Override
    public String toString() {
        return "Merguez{" +
                "length=" + this.getLength() +
                ", diameter=" + this.getDiameter() +
                ", meat=" + this.getMeat() +
                ", spiciness=" + spiciness +
                '}';
    }
}
