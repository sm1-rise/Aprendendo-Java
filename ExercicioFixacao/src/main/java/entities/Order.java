package entities;

import java.util.ArrayList;
import java.util.Date;

public class Order {
    private Date moment;
    private OrderStatus status;

    private ArrayList <OrderItem> orderItens = new ArrayList<OrderItem>();
    public Order(){
    }
    public Order (Date moment, OrderStatus status){
        super();
        this.moment = moment;
        this.status = status;
    }

    public void addItem(OrderItem order){
        orderItens.add(order);
    }

    public void removeItem(OrderItem order){
        orderItens.remove(order);
    }

    public double total(){
        double total = 0;



        return total;
    }






}
