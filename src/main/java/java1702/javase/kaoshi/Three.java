package java1702.javase.kaoshi;

import java.util.Arrays;

/**
 * Created by zhoumeng on
 * 2017/4/15.
 * 8:52.
 */
//拆分字符串，字符串中含有逗号和数字，对数字排序并输出
//        例如：String s0=”123,45,25,85”;
//        输出：25 45 85 123
public class Three {
    public static void main(String[] args) {
        String s0 = "123,45,25,85";
        String[] s1 = s0.split(",");
//        System.out.println(Arrays.toString(s1));

        int[] ints = new int[s1.length];
        for (int i = 0; i < ints.length; i++)
            ints[i] = Integer.parseInt(s1[i]);
        Arrays.sort(ints);
//        System.out.println(Arrays.toString(a));
        for (int number : ints)
            System.out.print(number + " ");
    }
}