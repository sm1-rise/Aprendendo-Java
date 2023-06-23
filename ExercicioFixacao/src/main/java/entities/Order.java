package entities;

import enums.OrderStatus;

import java.util.ArrayList;
import java.util.Date;

public class Order {
    private Date moment;
    private OrderStatus status;
    private Client client;

    private ArrayList <OrderItem> orderItens = new ArrayList<OrderItem>();
    public Order(){
    }
    public Order (Date moment, OrderStatus status, Client client){
        super();
        this.moment = moment;
        this.status = status;
        this.client = client;
    }


    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public ArrayList<entities.OrderItem> getOrderItens() {
        return orderItens;
    }

    public void setOrderItens(ArrayList<entities.OrderItem> orderItens) {
        this.orderItens = orderItens;
    }

    public void addItem(OrderItem order){
        orderItens.add(order);
    }

    public void removeItem(OrderItem order){
        orderItens.remove(order);
    }

    public double total(){
        double total = 0;
        for(OrderItem e: orderItens){
            total = total + e.subTotal(e.getQuantity(),e.getPrice());
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: " + moment + "\n");
        sb.append("Order status: " + status + "\n");
        sb.append(client + "\n");
        sb.append("Order items: " + "\n");
        for (OrderItem e : orderItens ) {
            sb.append(e.toString());
        }
        sb.append("Total Price: $");
        sb.append(total() + "\n");

        return sb.toString();
        }

    }

