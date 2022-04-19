package dk.easv;

import dk.easv.ourproducts.Bicycle;
import dk.easv.ourproducts.Car;
import dk.easv.ourproducts.Scooter;
import dk.easv.ourproducts.Vehicle;
import dk.easv.theirproducts.Bus;
import dk.easv.theirproducts.BusAdapter;

public class Main {
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[] {
                new Bicycle(Vehicle.Color.Blue),
                new Bicycle(Vehicle.Color.Red),
                new Car(Vehicle.Color.Blue),
                new Scooter(Vehicle.Color.Green),
                new BusAdapter(Vehicle.Color.Blue)
        };

        for(Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getName() + " has a top speed of " + vehicle.getTopSpeedInKilometersPerHour() + " km/p");
            vehicle.honk();
            System.out.println();
        }

    }
}
