import java.util.Scanner;

class Car {
    int id, rent;
    String name;

    void getDetails(int i, String n, int r) {
        id = i;
        name = n;
        rent = r;
    }

    void display() {
        System.out.println("Car ID : " + id);
        System.out.println("Car Name : " + name);
        System.out.println("Rent Per Day : Rs." + rent);
    }
}
class Rental extends Car {
    void calculateRent(int days) {
        System.out.println("Total Rent : Rs." + (rent * days));
    }
}

class Customer extends Car {
    void customerName(String cname) {
        System.out.println("Customer Name : " + cname);
    }
}

public class CarRentalManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Rental r = new Rental();
        Customer c = new Customer();

        System.out.print("Enter Customer Name: ");
        String cname = sc.nextLine();

        System.out.print("Enter Car ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Car Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Rent Per Day: ");
        int rent = sc.nextInt();

        System.out.print("Enter Days: ");
        int days = sc.nextInt();

        r.getDetails(id, name, rent);

        System.out.println("\n--- Rental Bill ---");
        c.customerName(cname);
        r.display();
        r.calculateRent(days);

        sc.close();
    }
}
