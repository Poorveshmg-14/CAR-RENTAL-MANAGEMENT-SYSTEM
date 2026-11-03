import java.util.Scanner;
abstract class Car {
 int id, rent;
 String number, name;
 void getDetails(int i, String n, String nm, int r) {
 id = i;
 number = n;
 name = nm;
 rent = r;
 }
 void display() {
 System.out.println("\nCar ID : " + id);
 System.out.println("Car Number : " + number);
 System.out.println("Car Name : " + name);
 System.out.println("Rent/Day : Rs." + rent);
 }
 abstract void calculateRent(int days);
}
class CarRental extends Car {
 void calculateRent(int days) {
 System.out.println("Days : " + days);
 System.out.println("Total Rent : Rs." + (rent * days));
 }
}
public class CarRentalManagement {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 CarRental c = new CarRental(); System.out.print("Enter Car ID: ");
 int id = sc.nextInt();
 sc.nextLine();
 System.out.print("Enter Car Number: ");
 String number = sc.nextLine();
 System.out.print("Enter Car Name: ");
 String name = sc.nextLine();
 System.out.print("Enter Rent/Day: ");
 int rent = sc.nextInt();
 System.out.print("Enter Days: ");
 int days = sc.nextInt();
 c.getDetails(id, number, name, rent);
 c.display();
 c.calculateRent(days);
 sc.close();
 }
}
