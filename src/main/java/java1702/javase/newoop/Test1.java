package java1702.javase.newoop;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by zhoumeng on
 * 2017/4/7.
 * 15:15.
 */
public class Test1 {
    public static void main(String[] args) {
        int[][] ints = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int mul = 1;
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.println("input int: " + (i * ints[i].length + (j + 1))); // ?
                ints[i][j] = scanner.nextInt();
                if (i == j) {
                    sum += ints[i][j];
                }
                if (i + j == ints.length - 1) { // ?
                    mul *= ints[i][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(ints));
        System.out.println(sum);
        System.out.println(mul);
    }
}
