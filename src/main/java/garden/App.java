package garden;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        Gardener gardener = new Gardener("Bob", Speciality.FLOWER);
        Plant plant = new Flower("coquelicot", 12.0, false, Color.RED, 8);
        Plant tree = new Tree("baobab", 1300.0, false, "chépa", LocalDate.of(1600, 2, 2));

        gardener.harvest(plant);

    }
}
