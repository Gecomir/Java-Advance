package Functional_Programming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUpperCaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Predicate<String> withUppercase = w -> Character.isUpperCase(w.charAt(0));
        List<String> text = Arrays.stream(scanner.nextLine().split(" "))
                .filter(withUppercase)
                .collect(Collectors.toList());

        System.out.println(text.size());
        System.out.println(String.join(System.lineSeparator(), text));
    }
}
