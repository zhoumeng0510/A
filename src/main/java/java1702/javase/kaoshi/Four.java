package java1702.javase.kaoshi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zhoumeng on
 * 2017/4/15.
 * 8:52.
 */
//输入一段字符串，字符串中只包含大小写字母。
// 要求完成函数删除给定字符串中出现次数最少的字符。
// 输出删除完的字符串。如果有多个出现次数一样的字符，都为最少时，一并删除。
// 例如：输入:abbccd，输出为bbcc
public class Four {
    public static void main(String[] args) {
        Four text = new Four();
        String result = text.getMinString();
        System.out.println(result);
    }

    private String getMinString() {
        System.out.println("原字符串:" + "abbccd");
        char[] chars = "abbccd".toCharArray();
        List<String> list = new ArrayList<>();
        for (char char1 : chars) list.add(char1 + "");
        int minTime = 0;
        int[] count = new int[list.size()];
        for (int i = 0; i < count.length; i++)
            count[i] = 0;

        for (int i = 0; i < list.size(); i++) {
            for (String aList : list) {
                if (list.get(i).equals(aList))
                    count[i]++;
            }
            minTime = count[1];
            if (minTime >= count[i])
                minTime = count[i];
        }
        System.out.println("每个字母出现的次数：" + Arrays.toString(count));
        System.out.println("字母出现的最少次数：" + minTime);

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < count.length; i++) {
            if (count[i] > minTime)
                stringBuilder.append(list.get(i));
        }
        return stringBuilder.toString();
    }
}