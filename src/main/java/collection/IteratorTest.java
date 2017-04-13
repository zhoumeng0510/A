package collection;

import java.util.*;

/**
 * Created by zhoumeng on
 * 2017/4/12.
 * 10:49.
 */
public class IteratorTest {

    private static final int KEY = 2;

    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();
        list.add("a");
        list.add("b");

        for (String aList1 : list) {
            System.out.println(aList1);
        }

        TreeSet<String>set = new TreeSet<>();
        set.add("a");
        set.add("b");

        for (String aList : list) {
            System.out.println(aList);
        }

        HashMap<Integer,String>map = new HashMap<>();
        map.put(1,"a");
        map.put(KEY,"bcd");

        for (Integer key : map.keySet()) {
            System.out.println(key + ">" + map.get(key));
        }
    }
}
