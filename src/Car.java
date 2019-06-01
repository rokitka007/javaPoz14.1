import java.time.Year;

public class Car {

    private String productionYear;
    private String model;
    private int speed;

    public Car(String productionYear, String model) {
        this.productionYear = productionYear;
        this.model = model;
        this.speed = 0;
    }

    public void accelerate() {
        this.speed += 5;
    }

    public void slowDown() {
        this.speed -= 5;
    }

    public String getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(String productionYear) {
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
