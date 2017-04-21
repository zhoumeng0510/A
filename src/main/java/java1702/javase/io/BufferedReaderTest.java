package java1702.javase.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by zhoumeng on
 * 2017/4/21.
 * 9:44.
 */
public class BufferedReaderTest {
    private static final String FILE = "src/main/java/java1702/javase/io/BufferedReaderTest.java";

    public static void main(String[] args) {
            try (BufferedReader reader = new BufferedReader(new FileReader(FILE))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
