import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        Scanner stdin = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter departament's name: ");
        String nameDepartament = stdin.nextLine();
        System.out.println("Enter worker data: ");
        System.out.println("Name: ");
        String nameWorker = stdin.nextLine();
        System.out.println("Level: ");
        String workerLevel = stdin.nextLine();
        System.out.println("Base Salary: ");
        double baseSalary = stdin.nextDouble();

        Departament departament = new Departament(nameDepartament);
        Worker worker1 = new Worker(nameWorker,WorkerLevel.valueOf(workerLevel),baseSalary,departament);

        System.out.println("How many contract to this worker ?");
        int qtContract = stdin.nextInt();

        for(int i = 1; i <= qtContract; ++i){
            System.out.println("Enter contract #" + i + " data: ");
            System.out.println("Date (DD/MM;YYYY)");
            Date dateContract = format.parse(stdin.next());
            System.out.println("Value per hour: ");
            double valuePerHour = stdin.nextDouble();
            System.out.println("Duration");
            int duration = stdin.nextInt();

            HourContract hourContract = new HourContract(dateContract, valuePerHour, duration);
            worker1.addContract(hourContract);
        }

        System.out.println("Enter mouth and year to calculate income (MM/YYYY)");
        String mouthDay = stdin.next();
        int mouth = Integer.parseInt(mouthDay.substring(0,2));
        int year = Integer.parseInt(mouthDay.substring(3));

        System.out.println("Name: " + worker1.getName());
        System.out.println("Departament: " + worker1.getDepartament().getName());
        System.out.println("Income: " + String.format("%.2f",worker1.income(mouth,year)));


    }
}
