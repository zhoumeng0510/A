package java1702.javase.generic;

import java.util.Vector;

/**
 * Created by zhoumeng on
 * 2017/4/13.
 * 9:52.
 */
public class VectorTest {
    public static void main(String[] args) {
        Vector vector = new Vector();// 兼容
        vector.add("test...");
        vector.add("123");
        vector.add("true");
        vector.add(456);

        String s = (String)vector.get(3);
        System.out.println(s);
    }
}
