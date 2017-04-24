package java1702.javase.exercise;

/**
 * Created by zhoumeng on
 * 2017/4/24.
 * 13:40.
 */
//输出9*9乘法口诀表
public class E16 {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i >= j) {
                    System.out.print((i + 1) * (j + 1) + "\t");
                }
            }
            System.out.println();
        }
    }
}
