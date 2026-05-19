import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== ЗАВДАННЯ 1 ===");
        for (int i = 0; i < 50; i++) {
            System.out.println("Java");
        }
        int t1 = 0;
        while (t1 < 50) {
            System.out.println("Java");
            t1++;
        }

        System.out.println("\n=== ЗАВДАННЯ 2 ===");
        for (int i = 0; i <= 179; i++) {
            System.out.println((i / 60) + " h " + (i % 60) + " min");
        }

        System.out.println("\n=== ЗАВДАННЯ 3 ===");
        int t3 = 0;
        while (t3 <= 179) {
            System.out.println((t3 / 60) + " h " + (t3 % 60) + " min");
            t3++;
        }

        System.out.println("\n=== ЗАВДАННЯ 4 ===");
        for (int i = 0; i <= 179; i++) {
            System.out.println((i / 60) + " h " + (i % 60) + " min " + (i % 60) + " sec");
        }

        System.out.println("\n=== ЗАВДАННЯ 5 ===");
        System.out.print("Введіть нижню межу діапазону значень функцій: ");
        double lower = scanner.nextDouble();
        System.out.print("Введіть верхню межу діапазону значень функцій: ");
        double upper = scanner.nextDouble();

        int countFor = 0;
        System.out.println("--- Спосіб 1: Цикл for ---");
        for (int i = 0; i <= 20; i++) {
            double x = 1.0 + i * 0.1;
            double fx = 1 - x + Math.sin(x) - Math.cos(1 + x);
            System.out.printf("x = %.1f; f(x) = %.4f\n", x, fx);
            if (fx >= lower && fx <= upper) {
                countFor++;
            }
        }
        if (countFor > 0) {
            System.out.println("Кількість значень у діапазоні: " + countFor);
        } else {
            System.out.println("Повідомлення: значення у заданому діапазоні відсутні");
        }

        int countWhile = 0;
        int j = 0;
        System.out.println("--- Спосіб 2: Цикл while ---");
        while (j <= 20) {
            double x = 1.0 + j * 0.1;
            double fx = 1 - x + Math.sin(x) - Math.cos(1 + x);
            System.out.printf("x = %.1f; f(x) = %.4f\n", x, fx);
            if (fx >= lower && fx <= upper) {
                countWhile++;
            }
            j++;
        }
        if (countWhile > 0) {
            System.out.println("Кількість значень у діапазоні: " + countWhile);
        } else {
            System.out.println("Повідомлення: значення у заданому діапазоні відсутні");
        }
    }
}
