package Defining_classes.SpeedRacing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countCar = Integer.parseInt(scanner.nextLine());

        Map<String, Car> carMap = new LinkedHashMap<>();
        for (int i = 0; i < countCar; i++) {
            String[] token = scanner.nextLine().split(" ");
            String model = token[0];
            double fuelAmount = Double.parseDouble(token[1]);
            double consumption = Double.parseDouble(token[2]);

            Car car = new Car(model, fuelAmount, consumption);
            carMap.put(model, car);
        }

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] commandParts = input.split(" ");

            String model = commandParts[1];
            int kilometers = Integer.parseInt(commandParts[2]);

            Car currentCar = carMap.get(model);
            if (!currentCar.hasEnoughFuel(kilometers)) {
                System.out.println("Insufficient fuel for the drive");
            } else {
                currentCar.drive(kilometers);
            }
            input = scanner.nextLine();
        }
        carMap.values().forEach(System.out::println);
    }
}
