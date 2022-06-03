package Sets_And_Maps_Advanced;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Map<Character, Integer> mapSymbol = new TreeMap<>();
        for (int i = 0; i < text.length(); i++) {
            char currentSymbol = text.charAt(i);
            if (!mapSymbol.containsKey(currentSymbol)) {
                mapSymbol.put(currentSymbol, 1);
            } else {
                int count = mapSymbol.get(currentSymbol);
                count++;
                mapSymbol.put(currentSymbol, count);
            }
        }
        for (var characterIntegerEntry : mapSymbol.entrySet()) {
            System.out.printf("%c: %d time/s%n", characterIntegerEntry.getKey(), characterIntegerEntry.getValue());
        }

    }
}
