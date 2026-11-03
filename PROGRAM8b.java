import java.util.Scanner;
class InvalidDaysException extends Exception {
 InvalidDaysException(String msg) {
 super(msg);
 }
}
public class CarRentalManagement {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter Car Name: ");
 String name = sc.nextLine();
 System.out.print("Enter Rent Per Day: ");
 int rent = sc.nextInt();
 System.out.print("Enter Number of Days: ");
 int days = sc.nextInt();
 try {
if (days <= 0)
  throw new InvalidDaysException("Invalid Number of Days");
System.out.println("\nCar Name : " + name); System.out.println("Rent/Day : Rs." + rent);
 System.out.println("Days : " + days);
 System.out.println("Total Rent : Rs." + (rent * days));
  } catch (InvalidDaysException e) {
 System.out.println("Exception : " + e.getMessage());
}
  sc.close();
 }
}
