import java.util.Date;
import java.util.LinkedList;

public class HourContract {
    private Date date;
    private double valuePerHour;
    private int hours;



   public HourContract (Date data, double valuePerHour, int hours){
       super();
       this.date = data;
       this.valuePerHour = valuePerHour;
       this.hours = hours;
   }


   public double totalValue(){
       double totalValue;
       totalValue = valuePerHour * hours;
       return totalValue;
   }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }


}
