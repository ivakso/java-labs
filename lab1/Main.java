class User {
    int id;
    int age;
    String name;
    String surname;
    double weight;
    double height;

    public User(int id, int age, String name, String surname, double weight, double height) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.weight = weight;
        this.height = height;
    }
}

class Car {
    int horsepower;
    double engineVolume;
    String brand;
    String model;
    int year;
    String color;
    double price;

    public Car(int horsepower, double engineVolume, String brand, String model, int year, String color, double price) {
        this.horsepower = horsepower;
        this.engineVolume = engineVolume;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }
}

public class Main {
    public static void main(String[] args) {
        
        System.out.println("=== ЗАВДАННЯ 1 ===");
        int a1 = 15, a2 = 3, a3 = 8, a4 = 12, a5 = 5, a6 = 2, a7 = 7, a8 = 14, a9 = 9, a10 = 10;

        int sum = a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10;
        int diff = a1 - a2 - a3 - a4 - a5 - a6 - a7 - a8 - a9 - a10;
        long product = (long) a1 * a2 * a3 * a4 * a5 * a6 * a7 * a8 * a9 * a10;
        double division = (double) a1 / a2 / a3 / a4 / a5 / a6 / a7 / a8 / a9 / a10;

        System.out.println("Сума: " + sum);
        System.out.println("Різниця (послідовна): " + diff);
        System.out.println("Добуток: " + product);
        System.out.printf("Частка (послідовне ділення): %.8f\n", division);
        
        System.out.println("\n=== ЗАВДАННЯ 2 ===");
        String w1 = "Я", w2 = "успішно", w3 = "виконую", w4 = "першу", w5 = "лабораторну", 
               w6 = "роботу", w7 = "з", w8 = "мови", w9 = "програмування", w10 = "високого", w11 = "рівня", w12 = "Java.";
        
        System.out.println(w1 + " " + w2 + " " + w3 + " " + w4 + " " + w5 + " " + w6 + " " + 
                           w7 + " " + w8 + " " + w9 + " " + w10 + " " + w11 + " " + w12);
        
        System.out.println("\n=== ЗАВДАННЯ 3 ===");
        User[] users = new User[10];
        users[0] = new User(1, 19, "Олександр", "Іванов", 75.5, 1.82);
        users[1] = new User(2, 21, "Марія", "Петренко", 54.2, 1.68);
        users[2] = new User(3, 20, "Дмитро", "Коваленко", 82.0, 1.88);
        users[3] = new User(4, 22, "Анна", "Сидоренко", 50.8, 1.62);
        users[4] = new User(5, 18, "Артем", "Мельник", 70.1, 1.76);
        users[5] = new User(6, 23, "Олена", "Шевченко", 58.4, 1.70);
        users[6] = new User(7, 20, "Віталій", "Ткаченко", 88.6, 1.85);
        users[7] = new User(8, 19, "Юлія", "Мороз", 53.0, 1.64);
        users[8] = new User(9, 25, "Сергій", "Бойко", 93.3, 1.91);
        users[9] = new User(10, 22, "Тетяна", "Кравченко", 61.2, 1.73);

        int totalUserAge = 0;
        double totalUserWeight = 0;
        double totalUserHeight = 0;

        for (User u : users) {
            totalUserAge += u.age;
            totalUserWeight += u.weight;
            totalUserHeight += u.height;
        }

        System.out.println("Сума віку всіх користувачів: " + totalUserAge + " років");
        System.out.printf("Сума ваги всіх користувачів: %.2f кг\n", totalUserWeight);
        System.out.printf("Сума зросту всіх користувачів: %.2f м\n", totalUserHeight);
        
        System.out.println("\n=== ЗАВДАННЯ 4 ===");
        Car[] cars = new Car[10];
        cars[0] = new Car(150, 2.0, "Toyota", "Camry", 2019, "Чорний", 21000);
        cars[1] = new Car(245, 2.0, "BMW", "330i", 2021, "Білий", 35000);
        cars[2] = new Car(110, 1.6, "Volkswagen", "Golf", 2016, "Сірий", 12500);
        cars[3] = new Car(420, 3.0, "Porsche", "911", 2020, "Червоний", 110000);
        cars[4] = new Car(180, 2.5, "Mazda", "CX-5", 2018, "Синій", 19500);
        cars[5] = new Car(140, 1.4, "Audi", "A4", 2017, "Сріблястий", 16000);
        cars[6] = new Car(500, 4.0, "Mercedes-Benz", "AMG GT", 2022, "Матовий чорний", 145000);
        cars[7] = new Car(90, 1.2, "Renault", "Clio", 2015, "Жовтий", 7000);
        cars[8] = new Car(300, 2.3, "Ford", "Mustang", 2019, "Помаранчевий", 26000);
        cars[9] = new Car(160, 2.0, "Hyundai", "Tucson", 2020, "Коричневий", 22000);

        double totalEngineVolume = 0;
        int totalHorsepower = 0;

        for (Car c : cars) {
            totalEngineVolume += c.engineVolume;
            totalHorsepower += c.horsepower;
        }

        System.out.printf("Сума об'ємів двигунів усіх автомобілів: %.1f л\n", totalEngineVolume);
        System.out.println("Сума потужностей (кінських сил) усіх автомобілів: " + totalHorsepower + " к.с.");
        
        System.out.println("\n=== ЗАВДАННЯ 5 ===");
        int originalNumber = 412;

        int units = originalNumber % 10;
        int tens = (originalNumber / 10) % 10;
        int hundreds = originalNumber / 100;

        int reversedNumber = (units * 100) + (tens * 10) + hundreds;

        System.out.println("Початкове число: " + originalNumber);
        System.out.println("Реверснуте число: " + reversedNumber);
    }
}
