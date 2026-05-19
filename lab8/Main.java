import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Помилка: вкажіть аргументи <ім'я_файлу> <b1> <b2>");
            return;
        }

        String filename = args[0];
        int b1 = Integer.parseInt(args[1]);
        int b2 = Integer.parseInt(args[2]);

        try {
            File file = new File(filename);

            if (!file.exists()) {
                file.createNewFile();
                System.out.println("Файл не існував і був створений: " + filename);
            } else {
                System.out.println("Файл уже існує: " + filename);
            }

            FileWriter writer = new FileWriter(file);
            Random random = new Random();
            
            for (int i = 0; i < 10; i++) {
                int randomNumber = random.nextInt(b2 - b1 + 1) + b1;
                writer.write(randomNumber + " ");
            }
            writer.close();
            System.out.println("Послідовність випадкових чисел успішно записана.");

            FileReader reader = new FileReader(file);
            System.out.print("Вміст файлу (вивід на консоль): ");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
            System.out.println();

        } catch (IOException e) {
            System.out.println("Помилка роботи з файлом: " + e.getMessage());
        }
    }
}
