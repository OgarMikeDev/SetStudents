import java.util.Scanner;
import java.util.TreeSet;

public class EmailList {
    public static void main(String[] args) {
        String regexForEmail = "[a-z0-9.]+@(mail.ru|yandex.ru|gmail.com)";

        String inputText = "";
        final String commandForAdd = "ADD ";
        final String commandForGetList = "LIST";
        TreeSet<String> setEmails = new TreeSet<>();

        while (!inputText.equals("LIST")) {
            System.out.println("Введите команду по примеру:\n" +
                    "ADD kulaev.m.v@gmail.ru\n" +
                    "LIST");
            inputText = new Scanner(System.in).nextLine();
            //ADD kulaev.m.v@mail.ru
            //ADD ogar.m.v@mail.ru
            if (inputText.contains(commandForAdd)) {
                int leftIndexForEmail = inputText.indexOf(commandForAdd) + commandForAdd.length();
                int rightIndexForEmail = inputText.length();
                String currentEmail = inputText.substring(leftIndexForEmail, rightIndexForEmail);
                System.out.println(currentEmail);
                if (currentEmail.matches(regexForEmail)) {
                    setEmails.add(currentEmail);
                    System.out.println("Почта " + currentEmail + " успешно добавлена :)");
                }
            } else if (inputText.equals(commandForGetList)) {
                for (String currentEmail : setEmails) {
                    System.out.println(currentEmail);
                }
            } else {
                System.out.println("Команда не верна :(\n" +
                        "Попробуйте снова :)");
            }

        }
    }
}
