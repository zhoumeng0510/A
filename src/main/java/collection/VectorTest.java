package collection;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.Vector;

/**
 * Created by zhoumeng on
 * 2017/4/8.
 * 9:53.
 */
public class VectorTest {
    public static void main(String[] args) {
        //vector 向量 矢量
        Vector<String> strings = new Vector<>(100000, 1000);// E element 元素
        for (int i = 0; i < 100; i++) {
            strings.add("hello");
        }
        strings.clear();
        strings.add("hi");
        System.out.println(strings.size()); // 大小
//        System.out.println(strings.get(0));
        System.out.println(strings.capacity());// capacity  容量

//        100k
    }
}
