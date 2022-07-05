package Test;

public class Food {
    String name;
    int amount;
    double price;

    public Food(String name, int amount, double price) {
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public int totalPrice() {
        return this.amount * (int)this.price;
    }
}
