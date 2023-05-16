package entities;

public class OrderItem {
    private int quantity;
    private double price;

    public OrderItem (){}

    public OrderItem (int quantity, double price){
        super();
        this.quantity = quantity;
        this.price = price;
    }

    public double subTotal(int quantity, double price){
        double sum = 0;
        sum = quantity * price;
        return sum;
    }

}
