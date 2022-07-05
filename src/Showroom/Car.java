package Showroom;

public class Car {
    int engineCpacity;
    String model;
    String color;

    public Car(int engineCpacity, String model, String color) {
        this.engineCpacity = engineCpacity;
        this.model = model;
        this.color = color;
    }

    public void showColor() {
        System.out.println("The color of " + this.model + " is " + this.color);
    }
}
