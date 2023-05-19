package entities;

public class OrderItem {
    private int quantity;
    private double price;
    private Product product;

    public OrderItem (){}

    public OrderItem (int quantity, double price, Product product){
        super();
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }



    public double subTotal(int quantity, double price){
        double sum;
        sum = quantity * price;
        return sum;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return product.getName() + ", " + getPrice() + "," + " Quantity: " + quantity + " Subtotal = $" + subTotal(quantity, product.getPrice()) + "\n";

    }

}
