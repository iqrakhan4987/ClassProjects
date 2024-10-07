//CET 3640 Hash Maps
//This program uses Hash Maps to search for a car by VIN
package practice_3;
import java.util.HashMap;

class Car {
    private String VIN;
    private String description;

    public Car(String VIN, String description) {
        this.VIN = VIN;
        this.description = description;
    }

    public String getVIN() {
        return VIN;
    }

    public String getDescription() {
        return description;
    }
}

public class HashMapCar {
    public static void main(String[] args) {
        // Create a HashMap to store Car objects with VINs as keys
        HashMap<String, Car> carMap = new HashMap<>();

        // Add some Car objects to the HashMap
        carMap.put("89A797", new Car("89A797", "2020 Subaru Forester"));
        carMap.put("78B234", new Car("78B234", "2019 Toyota Camry"));
        carMap.put("56C123", new Car("56C123", "2021 Honda Civic"));
        carMap.put("34D456", new Car("34D456", "2018 Ford Mustang"));
        carMap.put("12E789", new Car("12E789", "2017 Chevrolet Malibu"));
        carMap.put("23F890", new Car("23F890", "2022 BMW X5"));
        carMap.put("45G567", new Car("45G567", "2016 Mercedes-Benz E-Class"));
        carMap.put("67H234", new Car("67H234", "2023 Audi A4"));
        carMap.put("89I901", new Car("89I901", "2015 Hyundai Sonata"));
        carMap.put("01J567", new Car("01J567", "2024 Tesla Model S"));

        // Search for a specific Car object by VIN
        String searchVIN = "89A797";
        Car foundCar = carMap.get(searchVIN);
        if (foundCar != null) {
            System.out.println("Searching for the car with VIN " + searchVIN);
            System.out.println("VIN: " + foundCar.getVIN() + " Description: " + foundCar.getDescription() + ".");
        } else {
            System.out.println("Car with VIN " + searchVIN + " not found.");
        }
    }
}

