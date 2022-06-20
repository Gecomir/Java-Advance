package IteratorsAndComparators.StackIterator;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Stack current = new Stack();

        while (!command.equals("END")) {
            String[] tokens = command.split("\\s+|,\\s+");
            switch (tokens[0]) {
                case "Push":
                    current.push(Arrays.copyOfRange(tokens, 1, tokens.length));
                    break;
                case "Pop":
                    try {
                        current.pop();
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        Stack.print(current);
        Stack.print(current);
    }
}
