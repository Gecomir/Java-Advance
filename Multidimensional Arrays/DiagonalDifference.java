package Matrix;

import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[size][size];

        for (int row = 0; row < size; row++) {
            String[] input = scanner.nextLine().split(" ");
            for (int col = 0; col < size; col++) {
                matrix[row][col] = Integer.parseInt(input[col]);
            }
        }
        int firstDiagonalSum = 0;

        for (int counter = 0; counter < size; counter++) {
            firstDiagonalSum += matrix[counter][counter];
        }

        int secondDiagonalSum = 0;

        for (int row = 0; row < size; row++) {
            secondDiagonalSum += matrix[row][size - row - 1];
        }
        System.out.printf("%d", Math.abs(firstDiagonalSum - secondDiagonalSum));
    }
}
