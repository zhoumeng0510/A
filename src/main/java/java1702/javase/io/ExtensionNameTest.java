package java1702.javase.io;

/**
 * Created by zhoumeng on
 * 2017/4/21.
 * 10:10.
 */
public class ExtensionNameTest {
    public static void main(String[] args) {
        String s = "123.gif";
        System.out.println(s.substring(s.lastIndexOf('.')));
    }
}
