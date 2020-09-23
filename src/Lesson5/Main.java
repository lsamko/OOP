package Lesson5;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        File in = new File("C:\\Users\\l.samko\\Pictures/bug.jpg");
        File out = new File("bug.jpg");
        try {
            FileOperation.copyFile(in, out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
