package Functional_Programming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Function<int[], Integer> smallNumber = (int[] arr) -> {
            int min = Integer.MAX_VALUE;
            for (int element : arr) {
                if (element < min) {
                    min = element;
                }
            }
            return min;
        };
        System.out.println(smallNumber.apply(numbers));

    }
}
