import java.time.Year;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        String model;
        String year;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj model samochodu:");
        model = scanner.nextLine();
        System.out.println("Podaj rok produkcji:");
        year = scanner.nextLine();
        System.out.println(model + " " + year);

        Car car = new Car(year, model);
        car.accelerate();
        System.out.println("The current speed is " + car.getSpeed());
        for (int i = 0; i < 5; i++) {
            car.accelerate();
        }
        System.out.println("The current speed is " + car.getSpeed());
        while (car.getSpeed() != 0) {
            car.slowDown();
        }
        System.out.println("The current speed is " + car.getSpeed());
    }
}
