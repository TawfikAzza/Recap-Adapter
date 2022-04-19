package dk.easv.ourproducts;

public abstract class Vehicle {

    private Color color;

    public Vehicle(Color color) {
        this.color = color;
    }

    public enum Color {
        Red,
        Blue,
        Green,
        Yellow
    }

    public Color getColor() {
        return color;
    }

    public abstract double getTopSpeedInKilometersPerHour();
    public abstract void honk();
    public abstract String getName();

}
