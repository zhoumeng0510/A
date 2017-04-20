package java1702.javase.io;

import java.io.*;

/**
 * Created by zhoumeng on
 * 2017/4/20.
 * 8:58.
 */
public class OutputStreamTest {
    public static void main(String[] args) {
        OutputStream outputStream = null;
        try { // Shift + Ctrl + arrow | Shift + Option + arrow
            outputStream = new FileOutputStream("new");
            outputStream.write(97);
            outputStream.flush(); //
        } catch (java.io.IOException e) {
            e.printStackTrace();
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
