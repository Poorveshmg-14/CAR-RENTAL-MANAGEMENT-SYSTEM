import java.util.Scanner;
class CarRental {
 String carName;
 int rent, days;
 synchronized void bookCar(String name, int r, int d) {
   carName = name;
rent = r;
days = d;
 System.out.println("\nCar Booking Started...");
 System.out.println("Car " + carName + " is locked for booking.");
      try {
Thread.sleep(1000);
} catch (InterruptedException e) {
System.out.println(e);
}
System.out.println("Car Booking Completed!");
 }
 synchronized void generateBill() {
      System.out.println("\nGenerating Rental Bill...");
System.out.println("Car Name : " + carName);
System.out.println("Rent/Day : Rs." + rent);
System.out.println("Days : " + days);
System.out.println("Total Bill : Rs." + (rent * days));
System.out.println("Payment Ready!");
 }
}public class CarRentalManagement {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 CarRental rental = new CarRental();
  System.out.print("Enter Car Name: ");
String name = sc.nextLine();
  System.out.print("Enter Rent Per Day: ");
int rent = sc.nextInt();
  System.out.print("Enter Number of Days: ");
int days = sc.nextInt();
   Thread booking = new Thread(() -> {
rental.bookCar(name, rent, days);
});
  Thread billing = new Thread(() -> {
try {
      Thread.sleep(200);
} catch (InterruptedException e) {
System.out.println(e);
}
rental.generateBill();
});
  booking.start();
billing.start(); try {
booking.join();
  billing.join();
 } catch (InterruptedException e) {
System.out.println(e);
  }
 System.out.println("\nTransaction Completed Successfully.");
 sc.close();
 }
}
