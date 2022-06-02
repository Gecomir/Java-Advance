package Streams_Files_And_Directories;

import java.io.*;

public class SumLines {
    public static void main(String[] args) {


        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/04. Java-Advanced-Files-and-Streams-Exercises-Resources/input.txt"))) {


            String line = bufferedReader.readLine();
            while (line != null) {
                long sum = 0;
                char[] charactersFromLine = line.toCharArray();
                for (char c : charactersFromLine) {
                    sum += c;
                }
                line = bufferedReader.readLine();
                System.out.println(sum);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
