package Stack_And_Queues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int countToPush = input[0];
        int countToRemove = input[1];
        int searchNumber = input[2];

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < countToPush; i++) {
            stack.push(numbers[i]);
        }
        for (int i = 0; i < countToRemove; i++) {
            stack.pop();
        }
        if (stack.contains(searchNumber)) {
            System.out.println("true");
        } else {
            if (stack.isEmpty()) {
                System.out.println("0");
            } else {
                System.out.println(Collections.min(stack));
            }

        }
    }
}
