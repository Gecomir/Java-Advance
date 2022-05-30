package Streams_Files_And_Directories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CopyBytes {
    public static void main(String[] args) {

        String path = "input.txt";
        String output = "output.txt";


        try {
            FileInputStream inputStream = new FileInputStream(path);
            FileOutputStream outputStream = new FileOutputStream("CopyBytes.txt");

            int read = inputStream.read();

            PrintWriter writer = new PrintWriter(outputStream);

            while (read != -1) {
                if (read == ' ') {
                    writer.print(' ');
                } else if (read == 10) {
                    writer.println();
                } else {
                    writer.print(read);
                }
                read = inputStream.read();
            }
            writer.close();
        } catch (IOException ignored) {
        }
    }
}
