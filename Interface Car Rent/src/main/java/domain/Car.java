package domain;

public class Car {
    private String carName;

    public Car (){}

    public Car (String carName){
        super();
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
}
