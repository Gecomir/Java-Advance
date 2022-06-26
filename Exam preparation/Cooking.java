package Examp_Preparation;

import java.util.*;
import java.util.stream.Collectors;

public class Cooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> liquids = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> ingredients = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(ingredients::push);

        Map<String, Integer> cookedFoods = new TreeMap<>();
        cookedFoods.put("Bread", 0);
        cookedFoods.put("Cake", 0);
        cookedFoods.put("Pastry", 0);
        cookedFoods.put("Fruit Pie", 0);

        while (!liquids.isEmpty() && !ingredients.isEmpty()) {
            int lastIngredient = ingredients.poll();
            int sum = liquids.pop() + lastIngredient;

            String cookedFood;
            switch (sum) {
                case 25:
                    cookedFood = "Bread";
                    break;
                case 50:
                    cookedFood = "Cake";
                    break;
                case 75:
                    cookedFood = "Pastry";
                    break;
                case 100:
                    cookedFood = "Fruit Pie";
                    break;
                default:
                    cookedFood = null;
            }


            if (cookedFood != null) {
                int newValue = cookedFoods.get(cookedFood) + 1;
                cookedFoods.put(cookedFood, newValue);
            } else {
                ingredients.push(lastIngredient + 3);

            }
        }
        boolean allFoodAreCooked = cookedFoods.entrySet().stream().allMatch(e -> e.getValue() > 0);
        if (allFoodAreCooked) {
            System.out.println("Wohoo! You succeeded in cooking all the food!");
        } else {
            System.out.println("Ugh, what a pity! You didn't have enough materials to cook everything.");
        }
        String remainingLiquids = liquids.isEmpty() ? "none" : liquids.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.println("Liquids left: " + remainingLiquids);

        String remainingIngredients = ingredients.isEmpty() ? "none" : ingredients.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.println("Ingredients left: " + remainingIngredients);

        cookedFoods.entrySet()
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
    }
}
