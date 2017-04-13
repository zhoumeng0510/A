package java1702.javase.newoop;

/**
 * Created by zhoumeng on
 * 2017/4/7.
 * 9:01.
 */
public class ParameterPassTest {

    private static void test(int x) { // 形参
        System.out.println("b: " + x);
        x++;
        System.out.println("c: " + x);
    }

    public static void main(String[] args) {
        int i = 0;
        System.out.println("a: " + i);
        test(i); // 实参
        System.out.println("d: " + i);
    }
}
