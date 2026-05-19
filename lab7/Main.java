import java.util.ArrayList;
import java.util.Random;

class Driver {
    String name;
    int age;
    int experience;

    public Driver(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }
}

class Car {
    String brand;
    double power;
    Driver driver;
    double price;
    int year;

    public Car(String brand, double power, Driver driver, double price, int year) {
        this.brand = brand;
        this.power = power;
        this.driver = driver;
        this.price = price;
        this.year = year;
    }
}

class TaxiHelper {
    public static void orderTaxi(Car[] cars) {
        int randomIndex = new Random().nextInt(cars.length);
        Car selectedCar = cars[randomIndex];
        System.out.println("Автомобіль марки " + selectedCar.brand + " з водієм " + selectedCar.driver.name + " виїхав за вами");
        arriveAtPlace(selectedCar);
    }

    public static void arriveAtPlace(Car car) {
        System.out.println("Водій " + car.driver.name + " прибув на місце");
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> taxiFleet = new ArrayList<>();

        taxiFleet.add(new Car("Toyota Camry", 150, new Driver("Іван", 28, 6), 15000, 2018));
        taxiFleet.add(new Car("Skoda Octavia", 120, new Driver("Петро", 24, 3), 12000, 2017));
        taxiFleet.add(new Car("Volkswagen Passat", 140, new Driver("Андрій", 30, 7), 14000, 2019));
        taxiFleet.add(new Car("Renault Logan", 90, new Driver("Сергій", 26, 2), 9000, 2016));
        taxiFleet.add(new Car("Ford Focus", 130, new Driver("Олексій", 35, 12), 11000, 2015));
        taxiFleet.add(new Car("Hyundai Tucson", 115, new Driver("Дмитро", 23, 1), 10500, 2020));
        taxiFleet.add(new Car("Kia Sportage", 125, new Driver("Максим", 27, 4), 11500, 2019));
        taxiFleet.add(new Car("Nissan Qashqai", 110, new Driver("Володимир", 32, 5), 10000, 2016));
        taxiFleet.add(new Car("Mazda 6", 160, new Driver("Артем", 29, 3), 16000, 2021));
        taxiFleet.add(new Car("Honda Civic", 145, new Driver("Юрій", 31, 6), 13500, 2018));

        for (int i = 0; i < taxiFleet.size() / 2; i++) {
            Car car = taxiFleet.get(i);
            car.power = car.power * 1.1;
            car.driver = new Driver("Новий Водій " + (i + 1), 29, 4);
        }

        for (int i = 0; i < taxiFleet.size(); i += 2) {
            Car car = taxiFleet.get(i);
            car.power = car.power * 1.1;
            car.price = car.price * 1.05;
        }

        for (Car car : taxiFleet) {
            Driver d = car.driver;
            if (d.experience < 5 && d.age > 25) {
                d.experience += 1;
            }
        }

        Car[] carsArray = taxiFleet.toArray(new Car[0]);
        TaxiHelper.orderTaxi(carsArray);
    }
}
