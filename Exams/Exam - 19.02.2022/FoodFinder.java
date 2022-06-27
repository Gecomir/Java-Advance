package Examp.exam19_02_2022;

import java.util.*;
import java.util.stream.Collectors;

public class FoodFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> vowels = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toCollection(ArrayDeque::new)); //queue

        ArrayDeque<String> consonants = new ArrayDeque<>(); //stack
        Arrays.stream(scanner.nextLine().split(" "))
                .forEach(consonants::push);

        Map<String, Set<String>> word = new LinkedHashMap<>();
        word.put("pear", new HashSet<>());
        word.put("flour", new HashSet<>());
        word.put("pork", new HashSet<>());
        word.put("olive", new HashSet<>());

        List<String> foundWord = new ArrayList<>();

        while (!consonants.isEmpty() && !vowels.isEmpty()) {
            String singleVowel = vowels.poll();
            String singleConsonant = consonants.pop();

            for (var entry : word.entrySet()) {
                if (entry.getKey().contains(singleVowel)) {
                    entry.getValue().add(singleVowel);
                }
                if (entry.getKey().contains(singleConsonant)) {
                    entry.getValue().add(singleConsonant);
                }
            }
            vowels.offer(singleVowel);
        }

        for (var entry : word.entrySet()) {
            if (entry.getKey().length() == entry.getValue().size()) {
                foundWord.add(entry.getKey());
            }
        }
        System.out.println("Words found: " + foundWord.size());
        System.out.println(String.join(System.lineSeparator(), foundWord));
    }
}
