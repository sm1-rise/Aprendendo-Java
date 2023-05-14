import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

public class Worker {

    private String name;
    private WorkerLevel level;
    private double baseSalary;
    private Departament departament;

        private ArrayList<HourContract> contracts = new ArrayList<>();

    public Worker (){
    }

    public Worker (String name, WorkerLevel level, double baseSalary, Departament departament){
        super();
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;

    }

    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract (HourContract contract){
        contracts.remove(contract);
    }

    public double income(int mouth, int year){
        double sum = baseSalary;
        SimpleDateFormat format = new SimpleDateFormat("MM/yyyy");
        String dateWorker = Integer.parseInt(String.valueOf(mouth)) + "/" +  Integer.parseInt(String.valueOf(year));

        Calendar cal = Calendar.getInstance();

        for(HourContract e: contracts ){
            cal.setTime(e.getDate());
            int eYear = cal.get(Calendar.YEAR);
            int eMouth = 1 + cal.get(Calendar.MONTH);

            if(eYear == year && eMouth == mouth){
                sum = sum + e.totalValue();
            }
        }
        return sum;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setDepartament (Departament departament){
        this.departament = departament;
    }

    public Departament getDepartament (){
        return departament;
    }

}
