package Test;

public class Main {
    public static void main(String[] args) {
        Food food = new Food("Apple",5,10.2);
        System.out.println(food.totalPrice());
        food.checkFood();
    }
}
