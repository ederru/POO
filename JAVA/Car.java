public class Car {
    Integer id;
    String license;
    String driver;
    Integer passengers;


    public Car (String license, String driver) {
        this.license = license;
        this.driver = driver;
    }

    public void printCar(){
        System.out.println("License: " + this.license + " Driver: " + this.driver);
    }

}