import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        ArrayList<WorkerLevel> hourContract = new ArrayList<>();
        Scanner stdin = new Scanner(System.in);

        System.out.println("Enter departament's name: ");
        int code = stdin.nextInt();
        System.out.println("Enter worker data: ");
        System.out.println("Name: ");
        String nameWorker = stdin.nextLine();
        System.out.println("Level: ");
        int level = stdin.nextInt();
        System.out.println("Base Salary: ");
        double baseSalary = stdin.nextDouble();
        System.out.println("How many contract to this worker ?");
        int qtContract = stdin.nextInt();

        for(int i = 1; i <= qtContract; ++i){
            System.out.println("Enter contract #1 data: ");
            System.out.println("Date (DD/MM;YYYY)");
            /* DATE CALENDAR */
            System.out.println("Value per hour: ");
            double valuePerHour = stdin.nextDouble();
            System.out.println("Duration");
            int duration = stdin.nextInt();
        }


        WorkerLevel level1 = new Worker("s")



    }
}
