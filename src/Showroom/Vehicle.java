package Showroom;

public class Vehicle {
    int price;
    String model;

    public Vehicle(int price, String model) {
        this.price = price;
        this.model = model;
    }

    public void startEngine() {
        System.out.println(this.model + " started the engine!");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "price=" + price +
                ", model='" + model + '\'' +
                '}';
    }
}
