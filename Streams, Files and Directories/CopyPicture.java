package Streams_Files_And_Directories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPicture {
    public static void main(String[] args) {

        byte[] buffer = new byte[1024];
        try (FileInputStream fis = new FileInputStream("src/04. Java-Advanced-Files-and-Streams-Exercises-Resources/image.jpg");
             FileOutputStream fos = new FileOutputStream("src/04. Java-Advanced-Files-and-Streams-Exercises-Resources/CopyImage.jpg")) {

            while (fis.read(buffer) != -1) {
                fos.write(buffer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
