package hu.nive.ujratervezes.zarovizsga.aquarium;


public class Tang extends Fish {

    private boolean hasMemoryLoss;

    public Tang(String name, int weight, String color) {
        super(name, weight, color);

    }



    @Override
    public void feed() {
        increaseWeight(1);

    }

    @Override
    public boolean hasMemoryLoss() {
        return true;
    }
}
