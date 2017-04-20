package java1702.javase.execption;

/**
 * Created by zhoumeng on
 * 2017/4/17.
 * 9:08.
 */
public class Test {
    public static void main(String[] args) {
        try {
            System.out.println("test...");
            System.out.println("hello".charAt(1));
            System.out.println(new int[]{1, 2, 3}[0]);
            System.out.println(1 / 1);
            System.out.println(Integer.valueOf("123"));
            String s = "hi";
            System.out.println(s.toUpperCase());
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
