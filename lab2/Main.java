import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== ЗАВДАННЯ 1 ===");
        System.out.print("Введіть коефіцієнти a, b, c через пробіл: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = b * b - 4 * a * c;
        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("x1 = " + x1 + "; x2 = " + x2);
        } else if (d == 0) {
            double x = -b / (2 * a);
            System.out.println("x = " + x);
        } else {
            System.out.println("Рівняння не має дійсних коренів");
        }

        System.out.println("\n=== ЗАВДАННЯ 2 ===");
        System.out.print("Введіть координати точки px та py через пробіл: ");
        double px = scanner.nextDouble();
        double py = scanner.nextDouble();
        if (px > 0 && py > 0) {
            System.out.println("I квадрант");
        } else if (px < 0 && py > 0) {
            System.out.println("II квадрант");
        } else if (px < 0 && py < 0) {
            System.out.println("III квадрант");
        } else if (px > 0 && py < 0) {
            System.out.println("IV квадрант");
        } else if (px == 0 && py == 0) {
            System.out.println("Точка в початку координат");
        } else {
            System.out.println("Точка лежить на осі");
        }

        System.out.println("\n=== ЗАВДАННЯ 3 ===");
        System.out.print("Введіть ціле число для перевірки: ");
        int number = scanner.nextInt();
        if (Math.abs(number) >= 10 && Math.abs(number) <= 99 && number % 2 == 0) {
            System.out.println("Число є двозначним і парним");
        } else {
            System.out.println("Число не відповідає умовам");
        }

        System.out.println("\n=== ЗАВДАННЯ 4.1 ===");
        System.out.print("Введіть значення x для обчислення f(x): ");
        double xFunc = scanner.nextDouble();
        double fx;
        if (xFunc < -2) {
            fx = Math.exp(2 * xFunc);
        } else if (xFunc >= -2 && xFunc <= 5) {
            fx = 1.0 / Math.tan(xFunc);
        } else {
            fx = Math.pow(xFunc, 4);
        }
        System.out.println("f(x) = " + fx);

        System.out.println("\n=== ЗАВДАННЯ 4.2 ===");
        System.out.print("Введіть номер дня тижня (1-7): ");
        int day = scanner.nextInt();
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Робочий день");
                break;
            case 6:
            case 7:
                System.out.println("Вихідний день");
                break;
            default:
                System.out.println("Некоректний номер дня");
                break;
        }
    }
}
