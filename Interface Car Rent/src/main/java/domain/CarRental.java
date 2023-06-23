package domain;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;

public class CarRental {
    private LocalDateTime start;
    private LocalDateTime finish;
    private Car car;

    public CarRental(){}
    public  CarRental (LocalDateTime start, LocalDateTime finish, Car car){
        this.start = start;
        this.finish = finish;
        this.car = car;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getFinish() {
        return finish;
    }

    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
