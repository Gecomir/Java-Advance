package Sets_And_Maps_Advanced;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> guests = new TreeSet<>();

        String input = scanner.nextLine();

        while (!input.equals("PARTY")) {

            guests.add(input);

            input = scanner.nextLine();
        }
        String guestReservation = scanner.nextLine();

        while (!guestReservation.equals("END")) {
            guests.remove(guestReservation);

            guestReservation = scanner.nextLine();
        }
        System.out.println(guests.size());
        System.out.println(String.join(System.lineSeparator(), guests));
    }
}
