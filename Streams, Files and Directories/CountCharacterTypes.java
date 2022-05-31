package Streams_Files_And_Directories;

import java.io.*;

public class CountCharacterTypes {
    public static void main(String[] args) {

        int vowels = 0;
        int consonants = 0;
        int punctuation = 0;

        try (FileReader fileReader = new FileReader("src/04. Java-Advanced-Files-and-Streams-Exercises-Resources/input.txt");
             PrintWriter pw = new PrintWriter(new FileWriter("src/04. Java-Advanced-Files-and-Streams-Exercises-Resources/output.txt"))) {
            int symbol = fileReader.read();
            while (symbol != -1) {
                char symbolAssChar = (char) symbol;
                if (isVowel(symbolAssChar)) {
                    vowels++;
                } else if (isPunctuation(symbolAssChar)) {
                    punctuation++;
                } else if (!Character.isWhitespace(symbolAssChar) && !Character.isDigit(symbolAssChar)) {
                    consonants++;
                }

                symbol = fileReader.read();
            }
            pw.println("Vowels: " + vowels);
            pw.println("Consonants: " + consonants);
            pw.println("Punctuation: " + punctuation);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean isVowel(char character) {
        if (character == 'a' || character == 'o' || character == 'u' || character == 'e' || character == 'i') {
            return true;
        }
        return false;
    }

    public static boolean isPunctuation(char character) {
        if (character == '!' || character == ',' || character == '?' || character == '.') {
            return true;
        }
        return false;
    }
}
