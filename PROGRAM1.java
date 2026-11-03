class Car {
    int carId;
    String carNumber, carName;
    int rentPerDay;

    Car() { carId=0; carNumber="NA"; carName="No Car"; rentPerDay=0; }
    Car(int id, String number, String name, int rent) { carId=id; carNumber=number; carName=name; rentPerDay=rent; }
    Car(int id, String name) { carId=id; carNumber="Not Assigned"; carName=name; rentPerDay=1000; }
    Car(Car c) { carId=c.carId; carNumber=c.carNumber; carName=c.carName; rentPerDay=c.rentPerDay; }

    void display() {
        System.out.println("---------------------------");
        System.out.println("Car ID       : "+carId);
        System.out.println("Car Number   : "+carNumber);
        System.out.println("Car Name     : "+carName);
        System.out.println("Rent Per Day : Rs."+rentPerDay);
    }
    void rentCar(int days) {
        System.out.println("\nRental Details");
        System.out.println("Car Name      : "+carName);
        System.out.println("Number of Days: "+days);
        System.out.println("Total Rent    : Rs."+(days*rentPerDay));
    }
}

public class CarRentalManagement {
    public static void main(String[] args) {
        Car car1=new Car();
        Car car2=new Car(101,"TN38AB1234","Swift",1000);
        Car car3=new Car(102,"TN38CD5678","Innova",2000);
        Car car4=new Car(103,"Creta");
        Car car5=new Car(car2);

        System.out.println("===== CAR RENTAL MANAGEMENT =====");
        System.out.println("\n1. DEFAULT CONSTRUCTOR"); car1.display();
        System.out.println("\n2. PARAMETERIZED CONSTRUCTOR"); car2.display(); car3.display();
        System.out.println("\n3. OVERLOADED CONSTRUCTOR"); car4.display();
        System.out.println("\n4. COPY CONSTRUCTOR"); car5.display();

        System.out.println("\n===== RENT A CAR =====");
        car2.rentCar(3); car3.rentCar(2);
    }
}
