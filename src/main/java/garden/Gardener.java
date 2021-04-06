package garden;

import java.util.ArrayList;
import java.util.List;

public class Gardener {

    private String name;
    private Speciality speciality;
    private List<Plant> basket;

    public Gardener(String name, Speciality speciality) {
        this.name = name;
        this.speciality = speciality;
        this.basket = new ArrayList<>();
    }

    void harvest(Plant plant){
//        if(basket.size() <= 5){
//            if(plant.getClass().getSimpleName().equalsIgnoreCase(speciality.toString())){
//                System.out.println(this.name + " récolte 1 " + plant.getName());
//                basket.add(plant);
//            }
//            else {
//                System.out.println(this.name + " ne peut pas récolter ce genre de plante");
//            }
//        }
//        else{
//            System.out.println(this.getName() + " doit vider son panier");
//        }
        String name = plant.getClass().getSimpleName();
        System.out.println(plant.getClass().getSimpleName().equalsIgnoreCase("FLOWER")); // nom de la classe simplifiée
    }

    void emptyBasket(){
        basket.clear();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Gardener{" +
                "name='" + name + '\'' +
                ", speciality=" + speciality +
                '}';
    }
}
