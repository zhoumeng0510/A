package collection;
import java.util.*;
/**
 * Created by zhoumeng on
 * 2017/4/11.
 * 9:55.
 */
public class LinkedListTest {
    // link 链接\ [lɪŋk]
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("a");
        strings.add("b");
        System.out.println(strings.size());
        System.out.println(strings.get(0));

        for (String string : strings) {
            System.out.println(string);
        }

        System.out.println(strings.getFirst());
        System.out.println(strings.getLast());
    }
}