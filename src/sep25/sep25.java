//creat a java programe for a vehical rental system using interface
//create interface vehical with methodes rentvehical and calculate
//create clss car & bike that implement the interface
//store vehical details such as vehical no , model and rental days
//calculate and display the rental amount for both vehical
//use interface refrence to denonstrate runtime polymoshism


package sep25;

import java.util.Scanner;

interface Vehicle {
    void rentVehicle();
    double calculate();
}

// Car class
class Car implements Vehicle {
    String vehicleNo, model;
    int rentalDays;

    Car(String vehicleNo, String model, int rentalDays) {
        this.vehicleNo = vehicleNo;
        this.model = model;
        this.rentalDays = rentalDays;
    }

    public void rentVehicle() {
        System.out.println("Car Rented");
    }

    public double calculate() {
        return rentalDays * 1000;
    }

    void display() {
        System.out.println("Vehicle No: " + vehicleNo);
        System.out.println("Model: " + model);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Rental Amount: " + calculate());
    }
}

// Bike class
class Bike implements Vehicle {
    String vehicleNo, model;
    int rentalDays;

    Bike(String vehicleNo, String model, int rentalDays) {
        this.vehicleNo = vehicleNo;
        this.model = model;
        this.rentalDays = rentalDays;
    }

    public void rentVehicle() {
        System.out.println("Bike Rented");
    }

    public double calculate() {
        return rentalDays * 500;
    }

    void display() {
        System.out.println("Vehicle No: " + vehicleNo);
        System.out.println("Model: " + model);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Rental Amount: " + calculate());
    }
}

// Main class
public class sep25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Car input
        System.out.print("Enter Car Vehicle No: ");
        String carNo = sc.nextLine();

        System.out.print("Enter Car Model: ");
        String carModel = sc.nextLine();

        System.out.print("Enter Car Rental Days: ");
        int carDays = sc.nextInt();
        sc.nextLine();

        Car car = new Car(carNo, carModel, carDays);
        car.rentVehicle();
        car.display();

        System.out.println();

        // Bike input
        System.out.print("Enter Bike Vehicle No: ");
        String bikeNo = sc.nextLine();

        System.out.print("Enter Bike Model: ");
        String bikeModel = sc.nextLine();

        System.out.print("Enter Bike Rental Days: ");
        int bikeDays = sc.nextInt();

        Bike bike = new Bike(bikeNo, bikeModel, bikeDays);
        bike.rentVehicle();
        bike.display();

        sc.close();
    }
}