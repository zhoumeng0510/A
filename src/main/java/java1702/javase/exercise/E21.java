package java1702.javase.exercise;

/**
 * Created by zhoumeng on
 * 2017/5/3.
 * 19:20.
 */
// 求1+2!+3!+...+20!的和
public class E21 {
    public long get(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * get(n - 1);
        }
    }

    public static void main(String[] args) {
        long sum = 0;
        for (int i = 1; i < 21; i++) {
            long n = 1;
            for (int j = 1; j < i + 1; j++) { // i!
                n *= j;
            }
            sum += n;
        }
        System.out.println(sum);
    }
}