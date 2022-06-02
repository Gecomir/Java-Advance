package Streams_Files_And_Directories;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SumBytes {
    public static void main(String[] args) {


        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/04. Java-Advanced-Files-and-Streams-Exercises-Resources/input.txt"))) {


            String line = bufferedReader.readLine();
            long sum = 0;
            while (line != null) {
                char[] charactersFromLine = line.toCharArray();
                for (char c : charactersFromLine) {
                    sum += c;
                }
                line = bufferedReader.readLine();
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
