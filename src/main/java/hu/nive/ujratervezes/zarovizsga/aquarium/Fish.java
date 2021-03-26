package hu.nive.ujratervezes.zarovizsga.aquarium;

public abstract class Fish {

    private String name;

    private int weight;

    private String color;

    public Fish(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public Fish status(String name) {

    return null;}


    public abstract void feed();

    public abstract boolean hasMemoryLoss();

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    protected void increaseWeight(int increment) {
        weight += increment;
    }
}
