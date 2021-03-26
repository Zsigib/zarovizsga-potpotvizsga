package hu.nive.ujratervezes.zarovizsga.aquarium;


import java.util.ArrayList;
import java.util.List;

public class Aquarium {

    private List<Fish> fishes = new ArrayList<>();

    public List<String> getStatus() {
        List<String> status = new ArrayList<>();
        status.add(String.valueOf(fishes));
    return status;
    }

    public void addFish(Fish fish) {
        fishes.add(fish);

    }

    public void feed() {
        fishes.forEach(Fish::feed);
    }



    public void removeFish(Fish fish) {
        if (fish.getWeight() >= 11) {
        fishes.remove(fish);
    }
    }
}