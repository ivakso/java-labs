import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== ЗАВДАННЯ 1 ===");
        int[] evens = new int[50];
        int[] odds = new int[50];
        for (int i = 0; i < 50; i++) {
            evens[i] = (i + 1) * 2;
            odds[i] = i * 2 + 1;
        }
        System.out.println("Парні числа:");
        for (int num : evens) {
            System.out.print(num + " ");
        }
        System.out.println("\nНепарні числа:");
        for (int num : odds) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("\n=== ЗАВДАННЯ 2 ===");
        int[] numbers = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};
        
        int idx = 0;
        while (idx < numbers.length) {
            System.out.print(numbers[idx] + " ");
            idx++;
        }
        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        idx = 1;
        while (idx < numbers.length) {
            System.out.print(numbers[idx] + " ");
            idx += 2;
        }
        System.out.println();

        for (int i = 0; i < numbers.length; i += 2) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.println("\n=== ЗАВДАННЯ 3 ===");
        System.out.print("Введіть кількість дійсних елементів масиву n: ");
        int n = scanner.nextInt();
        double[] realArray = new double[n];
        System.out.print("Введіть " + n + " дійсних чисел через пробіл: ");
        double sum = 0;
        for (int i = 0; i < n; i++) {
            realArray[i] = scanner.nextDouble();
            sum += realArray[i];
        }
        System.out.println("Сума елементів масиву: " + sum);

        System.out.println("\n=== ЗАВДАННЯ 4 ===");
        System.out.print("Введіть кількість цілих елементів масиву: ");
        int size4 = scanner.nextInt();
        int[] array4 = new int[size4];
        System.out.print("Введіть " + size4 + " цілих чисел через пробіл: ");
        for (int i = 0; i < size4; i++) {
            array4[i] = scanner.nextInt();
        }
        for (int i = 0; i < size4; i++) {
            if (array4[i] % 2 != 0) {
                array4[i] = -array4[i];
            }
        }
        System.out.println("Масив після зміни знаків непарних елементів:");
        for (int num : array4) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
