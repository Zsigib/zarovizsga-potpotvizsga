package hu.nive.ujratervezes.zarovizsga.aquarium;


public class Tang extends Fish {

    private boolean hasMemoryLoss;

    public Tang(String name, int weight, String color, boolean hasMemoryLoss) {
        super(name, weight, color);
        this.hasMemoryLoss = hasMemoryLoss;
    }

    public Tang(String dory, int weight, String blue) {
        super();
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
