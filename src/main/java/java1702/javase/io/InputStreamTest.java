package java1702.javase.io;

import java.io.*;

/**
 * Created by zhoumeng on
 * 2017/4/20.
 * 8:58.
 */
public class InputStreamTest {
    public static void main(String[] args) {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("test"); // 绝对路径
            int i;
            while ((i = inputStream.read()) != -1) {
                System.out.println((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
