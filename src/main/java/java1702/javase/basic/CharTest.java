package java1702.javase.basic;

/**
 * Created by zhoumeng on
 * 2017/4/24.
 * 10:51.
 */
public class CharTest {
    public static void main(String[] args) {
        char c1 = 123; // ascii
        System.out.println((int)c1); // 强制类型转换

        char c2 = '中';
        System.out.println((int)c2); // unicode

        char c3 = '\123'; // 八进制 0-7 123 = 8^2*1 + 8^1*2 + 8^0*3 = 64 + 16 + 3 = 83
        System.out.println(c3);

        char c4 = '\u9fbb'; // 0-9 a-f [4E00, 9FBB]
        System.out.println(c4);

        char c5 = '\\'; // tab 水平制表符
        System.out.println(c5);

        System.out.print("a"); // ln - line
        System.out.print("b"); // ln - line
        System.out.print(c5); // ln - line
        System.out.print("c"); // ln - line
        System.out.print("d"); // ln - line
    }
}
