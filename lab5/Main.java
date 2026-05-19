import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== ЗАВДАННЯ 1 (ВАРІАНТ 1) ===");
        System.out.print("Введіть сторону квадрата: ");
        double side = scanner.nextDouble();
        double squareArea = getSquareArea(side);
        System.out.println("Площа квадрата: " + squareArea);

        System.out.println("\n=== ЗАВДАННЯ 2 ===");
        System.out.print("Введіть три числа через пробіл: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        double minNum = getMinOfThree(num1, num2, num3);
        System.out.println("Найменше число: " + minNum);

        System.out.println("\n=== ЗАВДАННЯ 3 та 4 ===");
        System.out.print("Введіть розмір масиву: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.print("Введіть елементи масиву через пробіл: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Виведення масиву: ");
        printArray(array);

        int maxNum = getMaxOfArray(array);
        System.out.println("Найбільше число з масиву: " + maxNum);
    }

    public static double getSquareArea(double side) {
        return side * side;
    }

    public static double getMinOfThree(double a, double b, double c) {
        double min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int getMaxOfArray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
