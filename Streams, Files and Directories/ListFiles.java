package Streams_Files_And_Directories;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class ListFiles {
    public static void main(String[] args) throws IOException {

        File root = new File("C:\\Users\\PC\\Desktop\\New folder\\" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources\\" +
                "Files-and-Streams");

        Arrays.stream(root.listFiles())
                .filter(File::isFile)
                .forEach(f -> System.out.println(f.getName() + ": " + "[" + f.length()+"]"));
    }
}
