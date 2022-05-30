package Sets_And_Maps_Advanced;

import java.util.HashMap;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> phonebook = new HashMap<>();
        String input = scanner.nextLine();

        while (!input.equals("search")) {
            String[] token = input.split("-");
            String name = token[0];
            String number = token[1];
            phonebook.put(name, number);

            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while (!input.equals("stop")) {
            if (phonebook.containsKey(input)) {
                System.out.printf("%s -> %s%n", input, phonebook.get(input));
            } else {
                System.out.printf("Contact %s does not exist.%n", input);
            }

            input = scanner.nextLine();
        }
    }
}
