class Car {
    private int id;
    private String number;
    protected String name;
    public int rent;

    static int totalCars = 0;

    Car(int id, String number, String name, int rent) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.rent = rent;
        totalCars++;
    }

    public void display() {
        System.out.println(id + " " + number + " " + name + " Rs." + rent);
    }

    public void rentCar(int days) {
        System.out.println("Total Rent : Rs." + (days * rent));
    }

    public void rentCar(int days, int discount) {
        System.out.println("Total Rent : Rs." + ((days * rent) - discount));
    }

    public static void showTotalCars() {
        System.out.println("Total Cars : " + totalCars);
    }
}

public class CarRentalManagement {
    public static void main(String[] args) {

        Car c1 = new Car(101, "TN38AB1234", "Swift", 1000);
        Car c2 = new Car(102, "TN38CD5678", "Innova", 2000);

        c1.display();
        c2.display();

        Car.showTotalCars();

        c1.rentCar(3);
        c2.rentCar(2, 500);
    }
}
