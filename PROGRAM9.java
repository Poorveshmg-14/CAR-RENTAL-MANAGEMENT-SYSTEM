import java.util.Scanner;
class CarRental {
 String carName;
 int rent, days;
 boolean available = false;
 synchronized void addRental(String name, int r, int d) {
    carName = name;
rent = r;
days = d;
available = true;
  System.out.println("Rental Added");
notify(); // Wakes up waiting thread
 }
 synchronized void processRental() {
         try {
while (!available) {
wait(); // Wait until rental is added
}
System.out.println("\n--- Rental Details ---");
System.out.println("Car Name : " + carName);
System.out.println("Rent/Day : Rs." + rent);
System.out.println("Days : " + days);
System.out.println("Total Rent : Rs." + (rent * days)); available = false;
 notifyAll(); // Wakes all waiting threads
   } catch (InterruptedException e) {
System.out.println(e);
}
 }
}
public class CarRentalManagement {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
CarRental rental = new CarRental();
  System.out.print("Enter Car Name: ");
String name = sc.nextLine();
  System.out.print("Enter Rent Per Day: ");
int rent = sc.nextInt();
  System.out.print("Enter Number of Days: ");
int days = sc.nextInt();
   Thread customer = new Thread(() -> {
rental.processRental();
}); Thread manager = new Thread(() -> {
rental.addRental(name, rent, days);
 });
  customer.start();
 manager.start();
 sc.close();
 }
}
