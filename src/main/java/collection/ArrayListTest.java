package collection;
import java.util.*;
/**
 * Created by zhoumeng on
 * 2017/4/11.
 * 9:06.
 */
public class ArrayListTest {
    public static void main(String[] args) {
        List<String> strings1 = new ArrayList<>();
        strings1.add("a");
        strings1.add("b");
        List<String> strings2 = new ArrayList<>();
        strings2.add("a");
        strings2.add("b");
        strings2.add("c");
// [a, c]
        System.out.println(strings1.equals(strings2));

        List<String> strings3 = strings2.subList(1, 3);
        System.out.println(strings3);

        System.out.println(strings3.containsAll(strings1));

        strings2.removeAll(strings3);
        System.out.println(strings2);

        // retain 保留\ [rɪ'teɪn]
        strings3.retainAll(strings2);
        System.out.println(strings3);
    }
}