package Examp;

import java.util.*;
import java.util.stream.Collectors;

public class ItIsChocolateTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Double> milkQueue = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Double::parseDouble)
                .collect(Collectors.toCollection(ArrayDeque::new));


        ArrayDeque<Double> cacaoStack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Double::parseDouble)
                .forEach(cacaoStack::push);

        Map<String, Integer> chocolateTypes = new TreeMap();

        chocolateTypes.put("Milk Chocolate", 0);
        chocolateTypes.put("Dark Chocolate", 0);
        chocolateTypes.put("Baking Chocolate", 0);

        while (!milkQueue.isEmpty() && !cacaoStack.isEmpty()) {

            double milk = milkQueue.poll();
            double cacao = cacaoStack.pop();
            double result = (cacao / (cacao + milk)) * 100;

            String chocolate = null;

            if (result == 30) {
                chocolate = "Milk Chocolate";
            } else if (result == 50) {
                chocolate = "Dark Chocolate";
            } else if (result == 100) {
                chocolate = "Baking Chocolate";
            } else {
                milkQueue.offer(milk + 10);
            }
            if (chocolate != null) {
                chocolateTypes.put(chocolate, chocolateTypes.get(chocolate) + 1);
            }
        }

        double enoughChocolateProduced = chocolateTypes.values().stream().filter(v -> v > 0).mapToDouble(Integer::valueOf).count();

        if (enoughChocolateProduced >= 3) {
            System.out.println("It’s a Chocolate Time. All chocolate types are prepared.");
        } else {
            System.out.println("Sorry, but you didn't succeed to prepare all types of chocolates.");
        }

        chocolateTypes.forEach((k, v) -> System.out.printf("# %s --> %d%n", k, v));
    }
}

