public class Car {
    Integer id;
    String license;
    String driver;
    Integer passengers;
    String brand;
    String model;


    public Car (String license, String driver, Integer passengers, String brand, String model) {
        this.license = license;
        this.driver = driver;
        this.passengers = passengers;
    }

    public void printCar(){
        System.out.println("License: " + this.license + " Driver: " + this.driver + " Passengers: " 
        + this.passengers);
    }

}