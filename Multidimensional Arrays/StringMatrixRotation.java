package Matrix;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rotation = scanner.nextLine();
        String input = scanner.nextLine();
        List<String> words = new ArrayList<>();

        int maxColLength = Integer.MIN_VALUE;

        while (!input.equals("END")) {
            int currentLength = input.length();

            if (currentLength > maxColLength) {
                maxColLength = currentLength;
            }
            words.add(input);
            input = scanner.nextLine();
        }
        int rows = words.size();
        int cols = maxColLength;
        char[][] matrix = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            String currentWord = words.get(row);
            for (int col = 0; col < cols; col++) {
                if (col < currentWord.length()) {
                    char currentChar = currentWord.charAt(col);
                    matrix[row][col] = currentChar;
                } else {
                    matrix[row][col] = ' ';
                }
            }
        }
        String angleString = rotation.split("[()]")[1];
        int angle = Integer.parseInt(angleString);
        int angleOfRotation = angle % 360;

        printMatrix(matrix, rows, cols, angleOfRotation);

    }

    private static void printMatrix(char[][] matrix, int rows, int cols, int angleOfRotation) {
        switch (angleOfRotation) {
            case 0:
                for (int row = 0; row < rows; row++) {
                    for (int col = 0; col < cols; col++) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
            case 90:
                for (int col = 0; col < cols; col++) {
                    for (int row = rows - 1; row >= 0; row--) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
            case 180:
                for (int row = rows - 1; row >= 0; row--) {
                    for (int col = cols - 1; col >= 0; col--) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
            case 270:
                for (int col = cols - 1; col >= 0; col--) {
                    for (int row = 0; row < rows; row++) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
        }
    }
}


