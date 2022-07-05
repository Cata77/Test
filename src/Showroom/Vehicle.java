package Showroom;

public class Vehicle {
    int price;
    String model;

    public Vehicle(int price, String model) {
        this.price = price;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "price=" + price +
                ", model='" + model + '\'' +
                '}';
    }
}
