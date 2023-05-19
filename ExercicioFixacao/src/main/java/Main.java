
import entities.*;
import enums.OrderStatus;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        Date moment = new Date();

        System.out.println("Enter cliente data:");
        System.out.println("Nome: ");
        String name = sc.nextLine();
        System.out.println("email: ");
        String email = sc.nextLine();
        System.out.println("Birth date (DD/MM/YYYY)");

        Date birthDay = format.parse(sc.nextLine());


        Client client = new Client(name,email,birthDay);

        System.out.println("Enter order data: ");
        System.out.println("Status: ");

        String status = sc.nextLine();

        Order order = new Order(moment,OrderStatus.valueOf(status),client);

        System.out.println("How many items to this order: ");
        int qtdItem = sc.nextInt();


        for(int i = 1; i <= qtdItem; i++){

            System.out.println("Enter "+" #" + i + " item data: ");
            System.out.println("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.println("Product Price: ");
            double price = sc.nextDouble();
            System.out.println("Quantity: ");
            int qtdProduct = sc.nextInt();
            Product product = new Product(productName,price);
            OrderItem orderItem = new OrderItem(qtdProduct,product.getPrice(),product);
            order.addItem(orderItem);
        }


        System.out.println();
        System.out.println("ORDER SUMMARY: ");
        System.out.println(order);




    }
}
