package garden;

import java.time.LocalDate;

public class Tree extends Plant{

    private String type;
    private LocalDate plantationDate;
    private Flower flower;


    public Tree(String name, double size, boolean isEdible, String type, LocalDate plantationDate) {
        super(name, size, isEdible);
        this.type = type;
        this.plantationDate = plantationDate;
    }

    public boolean hasLeaf(){
        if(type.equals("feuillu")){
            return true;
        }
        return false;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getPlantationDate() {
        return plantationDate;
    }

    public void setPlantationDate(LocalDate plantationDate) {
        this.plantationDate = plantationDate;
    }

    public Flower getFlower() {
        return flower;
    }

    public void setFlower(Flower flower) {
        this.flower = flower;
    }
}
