package hu.nive.ujratervezes.zarovizsga.aquarium;


import java.util.ArrayList;
import java.util.List;

public class Aquarium {

    private List<Fish> fishes = new ArrayList<>();

    public Fish getStatus() {


           }

    public void addFish(Fish fish) {
        fishes.add(fish);

    }

    public void feed() {
        fishes.forEach(Fish::feed);
    }

    public void removeFish(Fish fish) {
        fishes.remove(fish);}
}
