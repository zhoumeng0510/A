package java1702.javase.basic;

/**
 * Created by zhoumeng on
 * 2017/4/24.
 * 10:46.
 */
public class AssignmentOperators {
    public static void main(String[] args) {
        int i = 0;
        i += 1;
        i -= 2;
        i *= 5;
        i /= 4;
        i %= 5;
        System.out.println(i); // 0 1 -1

        boolean b = true;
        b &= false; // b = b & false
        System.out.println(b);

        i &= 1; // Bitwise & i = -1 & 1
        System.out.println(i);

        // 000...1 111...0 111...1
        //                 000...1  000...1
    }
}
