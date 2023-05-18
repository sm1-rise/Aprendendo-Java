import entities.*;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
        String bDay = sc.nextLine();

        Date birthDay = format.parse(sc.next());
        sc.nextLine();
        Client client = new Client(name,email,birthDay);

        System.out.println("Enter order data: ");
        System.out.println("Status: ");
        String status = sc.nextLine();

        Order order = new Order(moment,OrderStatus.valueOf(status),client);


        System.out.println("How many items to this order: ");
        int qtdItem = sc.nextInt();

        int price = 0;
        String productName = null;
        int qtdProduct = 0;

        for(int i = 1; i <= qtdItem; i++){
            System.out.println("Enter " + " #" + i + "item data: ");
            System.out.println("Product name: ");
            productName = sc.nextLine();
            price = sc.nextInt();
            System.out.println("Quantity: ");
            qtdProduct = sc.nextInt();

            Product product = new Product(productName,price);
            OrderItem orderItem = new OrderItem(qtdProduct,product.getPrice(),product);
            order.addItem(orderItem);
        }




    }
}
