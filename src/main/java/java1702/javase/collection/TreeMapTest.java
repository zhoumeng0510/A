package java1702.javase.collection;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by zhoumeng on
 * 2017/4/12.
 * 9:47.
 */
public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<Integer,String>map = new TreeMap<>();
        map.put(1,"a");
        map.put(-1,"bcd");
        map.put(100,"e");

        System.out.println(map.size());
        System.out.println(map.get(100));

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ">" + entry.getValue());
        }
    }
}
//