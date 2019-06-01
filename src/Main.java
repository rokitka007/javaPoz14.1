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
    }
}
