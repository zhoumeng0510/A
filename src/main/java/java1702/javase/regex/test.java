package java1702.javase.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zhoumeng on
 * 2017/4/27.
 * 8:48.
 */
public class test {
    public static void main(String[] args) {
//        Pattern   模式
//        Matcher   匹配
        Pattern pattern = Pattern.compile("l");//  JS  var pattern = /e/;
        Matcher matcher = pattern.matcher("hello");

//        System.out.println(matcher.find());
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
