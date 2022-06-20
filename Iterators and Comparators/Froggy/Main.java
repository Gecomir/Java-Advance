package IteratorsAndComparators.Froggy;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Integer> numberList = Arrays.stream(input.split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Lake lake = new Lake(numberList);

        List<String> result = new ArrayList<>();
        for (Integer integer : lake ) {
            result.add(integer + "");
        }
        System.out.println(String.join(", ", result));
    }
}
