package java1702.javase.exercise;

/**
 * Created by zhoumeng on
 * 2017/4/24.
 * 13:49.
 */
//  [100,200]
//素数：只能被1和它本身整除的正整数%
public class E2 {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            //如果i是素数
            boolean b = true;
            for (int j = 2; j < i / 2 + 1; j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                }
            }
            //  输出i
            if (b == true) {
                System.out.println(i);
            }
        }
    }
}
