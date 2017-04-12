package collection;

import java.util.*;

/**
 * Created by zhoumeng on
 * 2017/4/12.
 * 10:49.
 */
public class IteratorTest {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();
        list.add("a");
        list.add("b");

        Iterator<String>iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        TreeSet<String>set = new TreeSet<>();
        set.add("a");
        set.add("b");

        Iterator<String>iterator1 = list.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        HashMap<Integer,String>map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"bcd");

        Iterator<Integer> iterator2 = map.keySet().iterator();
        while (iterator2.hasNext()) {
            int key =  iterator2.next();
            System.out.println(key + ">" + map.get(key));
        }
    }
}
