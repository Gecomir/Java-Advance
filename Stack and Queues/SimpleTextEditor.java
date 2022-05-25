package Stack_And_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder text = new StringBuilder();
        ArrayDeque<String> stack = new ArrayDeque<>();
        ArrayDeque<String> removeElements = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] command = input.split(" ");
            String commandType = command[0];
            switch (commandType) {
                case "1":
                    stack.push(input);
                    executeAdd(command[1], text);
                    break;
                case "2":
                    stack.push(input);
                    int countToDelete = Integer.parseInt(command[1]);
                    StringBuilder stringBuilder = new StringBuilder();
                    for (int j = text.length() - countToDelete; j < text.length(); j++) {
                        stringBuilder.append(text.charAt(j));
                    }
                    removeElements.push(stringBuilder.toString());
                    executeDelete(countToDelete, text);
                    break;
                case "3":
                    int index = Integer.parseInt(command[1]);
                    System.out.printf("%s%n", text.charAt(index - 1));
                    break;
                case "4":
                    String lastCommand = stack.pop();
                    String[] lastCommandArguments = lastCommand.split(" ");
                    String lastCommandType = lastCommandArguments[0];
                    switch (lastCommandType) {
                        case "1":
                            int elementsToDelete = lastCommandArguments[1].length();
                            executeDelete(elementsToDelete, text);
                            break;
                        case "2":
                            String elementsToAddBack = removeElements.pop();
                            executeAdd(elementsToAddBack, text);
                            break;

                    }
                    break;
            }
        }
    }

    private static void executeDelete(int countToDelete, StringBuilder text) {
        for (int i = 0; i < countToDelete; i++) {
            text.deleteCharAt(text.length() - 1);
        }
    }

    private static void executeAdd(String command, StringBuilder text) {
        text.append(command);
    }
}
