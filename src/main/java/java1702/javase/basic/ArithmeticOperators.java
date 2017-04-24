package java1702.javase.basic;

/**
 * Created by zhoumeng on
 * 2017/4/24.
 * 10:39.
 */
public class ArithmeticOperators {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 5 / 7;

        double d1 = 1;
        double d2 = 2;
        System.out.println(z);
        System.out.println(d1 / d2);
        System.out.println(x / d2);
        System.out.println(d1 / y);

        String s1 = "hi";
        String s2 = "hello";

        System.out.println(x + y + s1 + d1);

        int i = 1;
        //i-- i=i-1;

        System.out.println(i--);//i++ ++i
        System.out.println(i);

        int m = -1000;
        int n = -300;

        //判断整除
        System.out.println(m % n);//求余

        // 3 billion devices ues java
    }
}
