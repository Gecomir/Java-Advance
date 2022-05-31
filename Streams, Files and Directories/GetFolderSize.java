package Streams_Files_And_Directories;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;

public class GetFolderSize {
    public static void main(String[] args) {

        File folder = new File("src/04. Java-Advanced-Files-and-Streams-Exercises-Resources/Exercises Resources");
        Deque<File> files = new ArrayDeque<>();
        files.offer(folder);
        int totalSize = 0;
        while (!files.isEmpty()) {
            File currentFile = files.poll();
            File[] nestedFile = currentFile.listFiles();
            for (File file : nestedFile) {
                if (file.isDirectory()) {
                    files.offer(file);
                } else {
                    totalSize += file.length();
                }
            }
        }
        System.out.println("Folder size: " + totalSize);
    }
}
