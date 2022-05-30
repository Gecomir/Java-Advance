package Streams_Files_And_Directories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExtractInteger {
    public static void main(String[] args) throws IOException {

        String path = "input.txt";

        FileInputStream inputStream = new FileInputStream(path);
        Scanner scanner = new Scanner(inputStream);

        PrintWriter writer = new PrintWriter("ExtractInteger.txt");

        FileOutputStream outputStream = new FileOutputStream("ExtractInteger.txt");

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                writer.println(scanner.next());
            } else {
                scanner.next();
            }
        }
        writer.close();

    }
}
