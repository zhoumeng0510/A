package java1702.javase.kaoshi;

import java.util.Scanner;

/**
 * Created by zhoumeng on
 * 2017/4/8.
 * 16:36.
 */
public class One {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串：");
        Scanner scanner = new Scanner(System.in);
        String strings = scanner.nextLine();
        byte[] bytes = strings.getBytes();
        int sum = 0;
        for (byte aByte : bytes) {
            sum += aByte;
        }
        System.out.println(sum);
    }
}
