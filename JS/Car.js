class Car {

    constructor(license, driver, brand, model) {
        this.id;
        this.license = license;
        this.driver = driver;
        this.passenger;
        this.brand = brand;
        this.model = model;
    }

    printDataCar() {
        console.log(this.license);
        console.log(this.driver);
        console.log(this.brand);
        console.log(this.model);
    }


}