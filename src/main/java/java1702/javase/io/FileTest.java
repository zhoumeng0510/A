package java1702.javase.io;

import java.io.File;
import java.io.IOException;

/**
 * Created by zhoumeng on
 * 2017/4/21.
 * 10:23.
 */
public class FileTest {
    public static void main(String[] args) {
        File file = new File("src");
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file.getName());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getParentFile());
    }
}