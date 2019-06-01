import java.time.Year;

public class Car {

    private Year productionYear;
    private String model;
    private int speed;

    public Car(Year productionYear, String model) {
        this.productionYear = productionYear;
        this.model = model;
        this.speed = 0;
    }

    public Year getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(Year productionYear) {
        this.productionYear = productionYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
