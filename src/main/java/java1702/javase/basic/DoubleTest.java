package java1702.javase.basic;

import java.math.BigDecimal;

/**
 * Created by zhoumeng on
 * 2017/4/24.
 * 10:52.
 */
public class DoubleTest {
    public static void main(String[] args) {
//        System.out.println(1.0d - 0.9d); // binary 0.1

//        System.out.println(10 - 9);
//        System.out.println((10d - 9d) / 10);

        double d1 = 1.0d;
        double d2 = 0.9d;

//        System.out.println(String.valueOf(d1) + String.valueOf(d2));

        BigDecimal bigDecimal1 = new BigDecimal(String.valueOf(d1));
        BigDecimal bigDecimal2 = new BigDecimal(String.valueOf(d2));
//
        System.out.println(bigDecimal1.subtract(bigDecimal2));
    }
}
