import java.util.Scanner;

class Person {
    String fullName;
    int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " рухається");
    }

    public void talk() {
        System.out.println(fullName + " говорить");
    }
}

class Phone {
    String number;
    String model;
    double weight;

    public Phone() {
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Дзвонить " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Дзвонить " + name + " з номера " + number);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String... numbers) {
        for (String num : numbers) {
            System.out.println("Повідомлення надіслано на номер: " + num);
        }
    }
}

class Shape {
    double volume;

    public double getVolume() {
        return volume;
    }
}

class SolidOfRevolution extends Shape {
    double radius;

    public double getRadius() {
        return radius;
    }
}

class Cylinder extends SolidOfRevolution {
    double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }
}

class Ball extends SolidOfRevolution {
    public Ball(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

class Pyramid extends Shape {
    double s;
    double h;

    public Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
    }

    @Override
    public double getVolume() {
        return (1.0 / 3.0) * s * h;
    }
}

abstract class Car {
    String model;
    String color;
    int maxSpeed;

    public void gas() {
        System.out.println("Газуємо!");
    }

    public abstract void brake();
}

class Sedan extends Car {
    public Sedan(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void brake() {
        System.out.println("Седан гальмує!");
    }
}

class Truck extends Car {
    public Truck(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void brake() {
        System.out.println("Грузовик гальмує!");
    }
}

class BankAccount {
    String name;
    String accountNumber;
    double balance;

    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        }
    }

    public void display() {
        System.out.println("Ім'я: " + name + ", Рахунок: " + accountNumber + ", Сальдо: " + balance);
    }
}

class PremiumBankAccount extends BankAccount {
    double interestRate;
    String currency;

    public PremiumBankAccount(String name, String accountNumber, double balance, double interestRate, String currency) {
        super(name, accountNumber, balance);
        this.interestRate = interestRate;
        this.currency = currency;
    }

    @Override
    public void display() {
        System.out.println("Ім'я: " + name + ", Рахунок: " + accountNumber + ", Сальдо: " + balance + " " + currency + ", Відсоток: " + interestRate + "%");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ЗАВДАННЯ 1 ===");
        Person person1 = new Person();
        Person person2 = new Person("Іван Іванов", 20);
        person1.fullName = "Петро Петров";
        person1.move();
        person2.talk();

        System.out.println("\n=== ЗАВДАННЯ 2 ===");
        Phone phone1 = new Phone("0971111111", "iPhone 13", 0.17);
        Phone phone2 = new Phone("0632222222", "Samsung S22");
        Phone phone3 = new Phone();
        phone3.number = "0503333333";
        phone3.model = "Xiaomi Note 11";
        phone3.weight = 0.19;

        System.out.println("Phone 1: " + phone1.getNumber() + ", " + phone1.model + ", " + phone1.weight);
        System.out.println("Phone 2: " + phone2.getNumber() + ", " + phone2.model + ", " + phone2.weight);
        System.out.println("Phone 3: " + phone3.getNumber() + ", " + phone3.model + ", " + phone3.weight);

        phone1.receiveCall("Олена");
        phone2.receiveCall("Андрій", "0674444444");
        phone3.sendMessage("0971111111", "0632222222");

        System.out.println("\n=== ЗАВДАННЯ 3 ===");
        Cylinder cylinder = new Cylinder(3, 5);
        Ball ball = new Ball(4);
        Pyramid pyramid = new Pyramid(10, 6);
        System.out.println("Об'єм циліндра: " + cylinder.getVolume());
        System.out.println("Об'єм кулі: " + ball.getVolume());
        System.out.println("Об'єм піраміди: " + pyramid.getVolume());

        System.out.println("\n=== ЗАВДАННЯ 4 ===");
        Sedan sedan = new Sedan("Toyota Camry", "Чорний", 220);
        Truck truck = new Truck("MAN", "Білий", 140);
        sedan.gas();
        sedan.brake();
        truck.gas();
        truck.brake();

        System.out.println("\n=== ЗАВДАННЯ 5 (ВАРІАНТ 5.1) ===");
        BankAccount account = new BankAccount("Олександр", "UA123456", 5000);
        account.display();
        account.deposit(1500);
        account.withdraw(2000);
        account.display();

        System.out.println("\n=== ЗАВДАННЯ 6 ===");
        PremiumBankAccount premiumAccount = new PremiumBankAccount("Дмитро", "UA789012", 10000, 4.5, "USD");
        premiumAccount.display();
    }
}
