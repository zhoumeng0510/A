package java1702.javase.exercise;

/**
 * Created by zhoumeng on
 * 2017/5/3.
 * 19:20.
 */
// 利用递归方法求5! = 5 * 4 * 3 * 2 * 1 = 5 * (5-1)!
public class E22 {
    public long get(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * get(n - 1);
        }
    }

    public static void main(String[] args) {
        int result = 1;
        for (int i = 1; i < 6; i++) {
            result *= i; // result = result * i;
        }
        System.out.println(result);
    }
}