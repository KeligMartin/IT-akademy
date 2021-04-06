public class Sausage implements Aliment {

    private double length;
    private double diameter;
    private Meat meat;

    public Sausage(double length, double diameter, Meat meat) {
        this.length = length;
        this.diameter = diameter;
        this.meat = meat;
    }

    @Override
    public void cook(int minutes){
        this.length = this.length * 0.9;
        this.diameter *= 0.9;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public Meat getMeat() {
        return meat;
    }

    public void setMeat(Meat meat) {
        this.meat = meat;
    }

    @Override
    public String toString() {
        return "Sausage{" +
                "length=" + length +
                ", diameter=" + diameter +
                ", meat=" + meat +
                '}';
    }
}
