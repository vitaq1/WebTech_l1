package by.bsuir.task9;

public class Ball {

    private String colour;
    private double weight;

    public Ball(String colour, double weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight can't be negative");
        }
        if ((colour == null) || colour.isEmpty()) {
            throw new IllegalArgumentException("Ball should have a color");
        }
        this.colour = colour;
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public double getWeight() {
        return weight;
    }

}
