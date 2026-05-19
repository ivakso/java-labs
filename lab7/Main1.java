import java.util.HashMap;

public class Main1 {
    public static void main(String[] args) {
        HashMap<String, String> book = new HashMap<>();

        book.put("Іванов", "0971111111");
        book.put("Петренко", "0632222222");
        book.put("Сидоренко", "0503333333");
        book.put("Коваленко", "0674444444");
        book.put("Мельник", "0935555555");
        book.put("Шевченко", "0986666666");
        book.put("Бойко", "0957777777");
        book.put("Moroz", "0668888888");
        book.put("Кравченко", "0739999999");
        book.put("Ткаченко", "0970000000");

        System.out.println("Вміст телефонної книги:");
        for (String surname : book.keySet()) {
            System.out.println(surname + ": " + book.get(surname));
        }
        System.out.println();

        String searchSurname1 = "Петренко";
        System.out.println("Пошук абонента " + searchSurname1 + ":");
        if (book.containsKey(searchSurname1)) {
            System.out.println("Номер телефону: " + book.get(searchSurname1));
        } else {
            System.out.println("У книзі відсутній такий абонент");
        }
        System.out.println();

        String searchSurname2 = "Васильєв";
        System.out.println("Пошук абонента " + searchSurname2 + ":");
        if (book.containsKey(searchSurname2)) {
            System.out.println("Номер телефону: " + book.get(searchSurname2));
        } else {
            System.out.println("У книзі відсутній такий абонент");
        }
        System.out.println();

        book.remove("Іванов");

        System.out.println("Кількість записів у книзі після видалення: " + book.size());
    }
}
