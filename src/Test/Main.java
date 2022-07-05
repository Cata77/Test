package Test;

import Showroom.Car;
import Showroom.Vehicle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the shop!");

        Vehicle vehicle = new Vehicle(50_000,"Mercedes");
        vehicle.startEngine();

        Car car = new Car(5_300,"Audi","purple");
        car.showColor();
        car.payTax();

        Person person = new Person(20,"Catalin","romanian",1.87);
        person.checkAge();
    }
}
