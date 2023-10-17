// Define a class called "Car"
class Car {
    // Instance variables (attributes)
    String brand;
    String model;
    int year;

    // Constructor - a method to initialize object's state
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display car information
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create instances (objects) of the Car class
        Car car1 = new Car("Toyota", "Camry", 2022);
        Car car2 = new Car("Honda", "Civic", 2021);

        // Call methods on the objects
        car1.displayInfo();
        car2.displayInfo();
    }
}