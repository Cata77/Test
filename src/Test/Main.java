package Test;

import Showroom.Vehicle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the shop!");

        Vehicle vehicle = new Vehicle(50_000,"Mercedes");
        vehicle.startEngine();
        System.out.println(vehicle);
    }
}
