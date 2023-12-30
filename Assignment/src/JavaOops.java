//1.5 Abstraction
abstract class Vehicle {
    private String brand;

    // Encapsulation
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

   
    abstract void displayInfo();
}

// Inheritance
class Car extends Vehicle {
    private int numberOfDoors;

 
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    // Polymorphism and Overriding
    @Override
    void displayInfo() {
        System.out.println("Car - Brand: " + getBrand() + ", Number of Doors: " + numberOfDoors);
    }
}


// Interface
interface ElectricVehicle {
    void charge();
}

// Class implementing interface
class ElectricCar extends Car implements ElectricVehicle {
  
    @Override
    void displayInfo() {
        System.out.println("Electric Car - Brand: " + getBrand() + ", Number of Doors: " + getNumberOfDoors());
    }


    @Override
    public void charge() {
        System.out.println("Charging Electric Car...");
    }
}


public class JavaOops {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setBrand("Toyota");
        myCar.setNumberOfDoors(4);
        myCar.displayInfo();

        ElectricCar myElectricCar = new ElectricCar();
        myElectricCar.setBrand("Tesla");
        myElectricCar.setNumberOfDoors(2);
        myElectricCar.displayInfo();
        myElectricCar.charge();
    }
}
