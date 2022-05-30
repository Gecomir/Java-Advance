package Sets_And_Maps_Advanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> cars = new LinkedHashSet<>();
        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String[] token = input.split(", ");
            String direction = token[0];
            String carNumber = token[1];
            if (direction.equals("IN")) {
                cars.add(carNumber);
            } else {
                cars.remove(carNumber);
            }

            input = scanner.nextLine();
        }
        if (!cars.isEmpty()) {
            System.out.println(String.join(System.lineSeparator(), cars));
        } else {
            System.out.println("Parking Lot is Empty");
        }
    }
}
