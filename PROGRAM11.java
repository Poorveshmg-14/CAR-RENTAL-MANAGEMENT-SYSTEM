class CarRental extends Thread {
 static Object car = new Object();
 static Object payment = new Object();
 boolean booking;
 CarRental(String name, boolean b) {
   }
super(name);
booking = b;
 public void run() {
     if (booking) {
synchronized (car) {
System.out.println("Car Locked");
try { Thread.sleep(1000); }
catch (Exception e) {}
         synchronized (payment) {
System.out.println("Booking Completed");
}
}
} else {
synchronized (payment) {
System.out.println("Payment Locked");
try { Thread.sleep(1000); }
catch (Exception e) {}
      }
}
synchronized (car) {
System.out.println("Payment Completed");
}
}
}
public class CarRentalManagement {
 public static void main(String[] args) {  CarRental t1 = new CarRental("Booking", true);
CarRental t2 = new CarRental("Payment", false);
   System.out.println("Car Rental Management");
System.out.println("Thread 1: " + t1.getState());
System.out.println("Thread 2: " + t2.getState());
  t1.start();
t2.start();
   try {
Thread.sleep(200);
} catch (Exception e) {}
   }
}
System.out.println("Thread 1: " + t1.getState());
System.out.println("Thread 2: " + t2.getState());
