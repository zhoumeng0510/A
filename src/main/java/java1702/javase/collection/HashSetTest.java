package java1702.javase.collection;
import java.util.*;

/**
 * Created by zhoumeng on
 * 2017/4/11.
 * 16:15.
 */
public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        strings.add("hello");
        strings.add("hi");
        strings.add("test");
        strings.add("Test");

//        ArrayList

        System.out.println(strings.size());
        for (String string : strings) {
            System.out.println(string);
        }
    }
}