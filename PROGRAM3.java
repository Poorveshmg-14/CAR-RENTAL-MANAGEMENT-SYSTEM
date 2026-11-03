import java.util.Scanner;

class Car {
    int id, rent;
    String number, name;

    Car(int id, String number, String name, int rent) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.rent = rent;
    }

    void display() {
        System.out.println(id + " " + number + " " + name + " Rs." + rent);
    }

    void rentCar(int days) {
        System.out.println("Total Rent : Rs." + (days * rent));
    }
}

public class CarRentalManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Car c1 = new Car(101, "TN38AB1234", "Swift", 1000);
        Car c2 = new Car(102, "TN38CD5678", "Innova", 2000);

        System.out.println("1.Display");
        System.out.println("2.Rent Car");
        System.out.print("Enter Choice: ");
        int ch = sc.nextInt();

        if (ch == 1) {
            c1.display();
            c2.display();
        } else if (ch == 2) {
            System.out.print("Enter Car ID: ");
            int id = sc.nextInt();
            System.out.print("Enter Days: ");
            int days = sc.nextInt();

            if (id == 101)
                c1.rentCar(days);
            else if (id == 102)
                c2.rentCar(days);
            else
                System.out.println("Invalid Car ID");
        } else {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
