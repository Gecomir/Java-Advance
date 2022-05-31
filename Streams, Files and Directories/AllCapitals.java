package Streams_Files_And_Directories;

import java.io.*;


public class AllCapitals {
    public static void main(String[] args) {


        try (BufferedReader br = new BufferedReader(new FileReader("src/04. Java-Advanced-Files-and-Streams-Exercises-Resources/input.txt"));
             PrintWriter pw = new PrintWriter(new FileWriter("src/04. Java-Advanced-Files-and-Streams-Exercises-Resources/output.txt"))) {
            br.lines().forEach(line -> pw.println(line.toUpperCase()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
