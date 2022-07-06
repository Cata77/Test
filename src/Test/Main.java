package Test;

import Showroom.Car;
import Showroom.Vehicle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the jugle");

        Vehicle vehicle = new Vehicle(50_000,"Mercedes");
        vehicle.startEngine();

        Car car = new Car(5_300,"Audi","purple");
        car.showColor();
        car.payTax();
        Food food = new Food("Apple",5,10.2);
        System.out.println(food.totalPrice());
        food.checkFood();
    }
}
