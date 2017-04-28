package java1702.javase.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by zhoumeng on
 * 2017/4/28.
 * 13:41.
 */
public class LoopTest {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3};
        for (int i = 0; i < ints.length; i++) {
            if (i != 1) {
                System.out.println(ints[i]);
            }
        }
        System.out.println("---");
        for (int anInt : ints) {
            System.out.println(anInt);
        }
        System.out.println("---");
        List<Integer> list = new ArrayList<>();
        list.add(123);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("---");
        for (Integer integer : list) {
            System.out.println(integer);
        }
        System.out.println("---");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
        }
    }
}
