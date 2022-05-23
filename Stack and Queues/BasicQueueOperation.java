package Stack_And_Queues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int countAddElement = input[0];
        int countRemoveElement = input[1];
        int searchElement = input[2];

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < countAddElement; i++) {
            queue.offer(numbers[i]);
        }
        for (int i = 0; i < countRemoveElement; i++) {
            queue.poll();
        }
        if (queue.contains(searchElement)) {
            System.out.println("true");
        } else {
            if (queue.isEmpty()) {
                System.out.println("0");
            } else {
                System.out.println(Collections.min(queue));
            }
        }
    }
}
