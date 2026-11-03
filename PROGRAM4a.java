import java.util.Scanner;
class Car {
    int carId;
    String carNumber;
    String carName;
    int rentPerDay;

    void getCarDetails(int id, String number, String name, int rent) {
        carId = id;
        carNumber = number;
        carName = name;
        rentPerDay = rent;
    }

    void displayCar() {
        System.out.println("\n----- Car Details -----");
        System.out.println("Car ID       : " + carId);
        System.out.println("Car Number   : " + carNumber);
        System.out.println("Car Name     : " + carName);
        System.out.println("Rent Per Day : Rs." + rentPerDay);
    }
}
class Rental extends Car {
    int days;
    void calculateRent(int d) {
        days = d;
        int total = rentPerDay * days;
        System.out.println("Number of Days : " + days);
        System.out.println("Total Rent     : Rs." + total);
    }
}
public class CarRentalManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Rental r = new Rental();

        System.out.println("===== CAR RENTAL MANAGEMENT =====");

        System.out.print("Enter Car ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Car Number: ");
        String number = sc.nextLine();

        System.out.print("Enter Car Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Rent Per Day: ");
        int rent = sc.nextInt();

        System.out.print("Enter Number of Days: ");
        int days = sc.nextInt();

        r.getCarDetails(id, number, name, rent);

        System.out.println("\n===== RENTAL DETAILS =====");
        r.displayCar();
        r.calculateRent(days);

        sc.close();
    }
}
