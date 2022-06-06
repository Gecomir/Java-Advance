package Functional_Programming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Function<List<Integer>, String> count = l -> "Count = " + l.size();

        Function<List<Integer>, Integer> sumAllElements = s -> s.stream().mapToInt(e -> e).sum();

        Function<Integer, String> sumFormat = s -> "Sum = " + s;

        String countOutput = count.apply(numbers);
        System.out.println(countOutput);

        int sum = sumAllElements.apply(numbers);
        String sumOutput = sumFormat.apply(sum);
        System.out.println(sumOutput);
    }
}
