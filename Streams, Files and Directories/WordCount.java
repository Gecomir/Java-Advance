package Streams_Files_And_Directories;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {


        try (Scanner scan = new Scanner(new FileReader("src/04. Java-Advanced-Files-and-Streams-Exercises-Resources/words.txt"));
             Scanner textScan = new Scanner(new FileReader("src/04. Java-Advanced-Files-and-Streams-Exercises-Resources/text.txt"));
             PrintWriter pw = new PrintWriter("src/04. Java-Advanced-Files-and-Streams-Exercises-Resources/result.txt")) {
            LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
            Arrays.stream(scan.nextLine().split(" ")).forEach(word -> map.put(word, 0));

            while (textScan.hasNext()) {
                String textInput = textScan.next();
                if (map.containsKey(textInput)) {
                    int currentCount = map.get(textInput);
                    currentCount++;
                    map.put(textInput, currentCount);
                }
            }
            map.entrySet().forEach(enty -> pw.printf("%s - %d%n", enty.getKey(), enty.getValue()));


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}