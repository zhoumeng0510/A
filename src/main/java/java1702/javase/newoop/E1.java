package java1702.javase.newoop;

/**
 * Created by zhoumeng on
 * 2017/4/19.
 * 20:55.
 */
//判断101-200之间有多少个素数，并输出所有素数。
public class E1 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 101; i < 200; i += 2) {
            boolean b = false;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                } else {
                    b = true;
                }
            }
            if (b) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("素数个数是: " + count);
    }
}
