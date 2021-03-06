package Streams_Files_And_Directories;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WriteToFile {
    public static void main(String[] args) {


        String path = "input.txt";
        String output = "output.txt";

        Set<Character> punctuation =  new HashSet<>();
        Collections.addAll(punctuation,',','.','!','?');

        try {
            FileInputStream inputStream = new FileInputStream(path);
            FileOutputStream outputStream = new FileOutputStream("WriteOutput.txt");


            int read = inputStream.read();

            while (read != -1) {

                if (!punctuation.contains((char) read)) {
                    outputStream.write(read);
                }
                read = inputStream.read();
            }
        } catch (IOException ignored) {
        }
    }

}
