package java1702.javase.generic;

import java.util.Date;

/**
 * Created by zhoumeng on
 * 2017/4/13.
 * 8:36.
 */
public class Test<T> {
    //java1702.javase.generic  通用的；泛型
    //general  一般的；

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.concat(1,2));
        System.out.println(test.concat(1996, 510));
        System.out.println(test.concat(new Date(),new Date()));
    }

    private String concat(T x, T y) {
        return String.valueOf(x).concat(String.valueOf(y));
    }
}