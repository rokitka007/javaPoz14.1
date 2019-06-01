import java.time.Year;

public class SportCar extends Car {
    private boolean turbo = false;

    public SportCar(Year productionYear, String model, boolean turbo) {
        super(productionYear, model);
        this.turbo = turbo;

    }
}
