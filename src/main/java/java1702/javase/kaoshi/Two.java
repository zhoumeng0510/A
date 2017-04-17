package java1702.javase.kaoshi;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhoumeng on
 * 2017/4/15.
 * 8:51.
 */
//找出字符串中出现次数最多的字母和出现的次数
public class Two {
    public static void main(String[] args) {
        String s1 = "sgvhfssadgygadjhgasdsdasdasdwqdas";
        getStr(s1);
    }

    private static void getStr(String s1) {
        char[] s0 = s1.toCharArray();
        List<Character> list = new ArrayList<Character>();
        for (char c : s0) {
            list.add(c);
        }
        int ints = 1;
        char int1 = s0[0];
        for (int i = 0; i < list.size() - 1; i++) {
            int count = 1;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    list.remove(j);
                    j--;
                    count++;
                }
                if (count > ints) {
                    int1 = list.get(i);
                    ints = count;
                }
            }
        }
        System.out.println("出现次数最多的字母是：" + int1 + "  " + " 出现次数：" + ints);
    }
}

