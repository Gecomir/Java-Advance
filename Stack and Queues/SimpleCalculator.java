package Stack_And_Queues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] token = scanner.nextLine().split("\\s+");
        ArrayDeque<String> stack = new ArrayDeque<>();
        Collections.addAll(stack, token);

        while (!stack.isEmpty()) {
            int first = Integer.parseInt(stack.pop());
            String operation = stack.pop();
            int second = Integer.parseInt(stack.pop());
            switch (operation) {
                case "+":
                    stack.push(String.valueOf(first + second));

                case "-":
                    stack.push(String.valueOf(first - second));

            }
            System.out.println(stack.pop());
        }
    }
}
