package java1702.javase.execption;

/**
 * Created by zhoumeng on
 * 2017/4/17.
 * 9:55.
 */
public class CatchTest {
    public static void main(String[] args) {
        try {
            System.out.println(1/1);

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("hello");
    }
}
