import java.util.Scanner;
class CarRental extends Thread {
 int id, rent, days;
 String name;
 CarRental(int id, String name, int rent, int days) {
 this.id = id;
 this.name = name;
 this.rent = rent;
 this.days = days;
 }
 public void run() {
 System.out.println("\n--- Car Rental Details ---");
 System.out.println("Car ID : " + id);
    System.out.println("Car Name : " + name);
System.out.println("Rent/Day : Rs." + rent);
System.out.println("Days : " + days);
System.out.println("Total Rent : Rs." + (rent * days));
 }
}
public class CarRentalManagement {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
    System.out.print("Enter Car ID: ");
int id = sc.nextInt();
sc.nextLine();
System.out.print("Enter Car Name: "); String name = sc.nextLine();
 System.out.print("Enter Rent/Day: ");
 int rent = sc.nextInt();
 System.out.print("Enter Days: ");
 int days = sc.nextInt();
 CarRental t = new CarRental(id, name, rent, days);
 t.start();
 sc.close();
 }
}
