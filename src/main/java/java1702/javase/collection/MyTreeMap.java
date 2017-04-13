package java1702.javase.collection;

import java.util.TreeMap;

/**
 * Created by zhoumeng on
 * 2017/4/12.
 * 10:48.
 */
public class MyTreeMap<K, V> extends TreeMap<K, V> {

    @Override
    public V put(K key, V value) {
        if (value == null) {
            throw new NullPointerException();
        }
        return super.put(key, value);
    }

    public static void main(String[] args) {
        MyTreeMap<Integer, String> map = new MyTreeMap<>();
        map.put(1, null);
    }
}