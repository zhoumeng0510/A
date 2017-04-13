package kaoshi;

import java.text.SimpleDateFormat;

/**
 * Created by zhoumeng on
 * 2017/4/8.
 * 16:18.
 */
//编写一个java应用程序，要求如下：
//        　　（1）声明一个String类的变量并初始化值“Hello World”。
//        　　（2）用字符串类的一个方法将上面变量的值拆分成” Hello” 和“World”两个字符串并打印输出。
//        　　（3）将” Hello”这个变量转换成大写、“World”转换成 小写并打印输出。
//        　　（4）声明一个String类的变量并初始化值“20100110”。
//        　　（5）将上面变量的值转换成2010年1月10日的形式打印输出。
public class Three {
    public static final String str1 = "Hello World";
    public static final String str2 = "20100110";
    public static void main(String[] args) {
        Three t = new Three();
        t.Demo();
    }
    public void Demo(){
        String[] s = str1.split(" ");
        System.out.println("拆分后："+s[0]+"、"+s[1]);
        System.out.println(s[0]+"大写："+s[0].toUpperCase());
        System.out.println(s[1]+"小写："+s[1].toLowerCase());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(str2.substring(0, 4)+"年"+str2.substring(4,6)+"月"+str2.substring(6)+"日");
    }
}
