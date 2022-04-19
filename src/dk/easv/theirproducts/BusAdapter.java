package dk.easv.theirproducts;

import dk.easv.ourproducts.Vehicle;

public class BusAdapter extends Vehicle {
    private Bus bus;

    public BusAdapter(Color color) {
        super(color);
    }

    @Override
    public double getTopSpeedInKilometersPerHour() {
        return 80;
    }

    @Override
    public void honk() {
        System.out.println("BOOOOOOOOO");
    }

    @Override
    public String getName() {
        return "Bus";
    }
}
