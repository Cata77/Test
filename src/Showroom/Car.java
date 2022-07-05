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

    public void payTax() {
        if (this.engineCpacity > 5_000)
            System.out.println("You'll have to pay extra taxes");
        else System.out.println("You're fine");
    }
}
