package java1702.javase.collection.newcollection;

import java.util.*;
/**
 * Created by zhoumeng on
 * 2017/4/10.
 * 8:59.
 */
public class HashtableTest {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable = new Hashtable<>();// K - key 键 V - value 值  K -> V
        hashtable.put(1,"a");
        hashtable.put(100,"hi");
        hashtable.put(2,"hello");
        hashtable.put(2,"test");
        hashtable.put(200,"test");
        hashtable.put(200,"test");
//        hashtable.put(3,null);
//        hashtable.put(null,"test");

        hashtable.remove(100);
        hashtable.clear();

        System.out.println(hashtable.size());
        System.out.println(hashtable.get(100));

        for (Integer integer : hashtable.keySet()) {
            System.out.println(integer + "->" + hashtable.get(integer));
        }

        for (String s : hashtable.values()) {
            System.out.println(s);
        }

        for (Map.Entry<Integer, String> integerStringEntry : hashtable.entrySet()) {
            System.out.println(integerStringEntry.getKey() + "->" + integerStringEntry.getValue());
        }
    }
}
