public class Car {
    private Integer id;
    private String license;
    private String driver;
    private Integer passengers;


    public Car (String license, String driver) {
        this.license = license;
        this.driver = driver;
    }

    public void printCar(){
        System.out.println("License: " + this.license + " Driver: " + this.driver);
    }

    public Integer getPassenger () {
        return this.passengers;
    }

    public void setPassengers(Integer passengers) {
        this.passengers = passengers;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    
}