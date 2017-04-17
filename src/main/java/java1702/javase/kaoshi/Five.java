package java1702.javase.kaoshi;

/**
 * Created by zhoumeng on
 * 2017/4/15.
 * 10:12.
 */
//写出一个程序，接受一个浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整
//        例如：
//        -4.5 四舍五入的结果是-4
//        4.4 四舍五入的结果是4
public class Five {
    public static void main(String[] args) {
        double data = -4.5;
        double s1 = 4.4;
        Five test = new Five();
        System.out.println(test.round(data));
        System.out.println(test.round(s1));
    }

    private int round(double d) {
        String string = Double.toString(d);
        String string1 = string.substring(string.indexOf(".") + 1, string.indexOf(".") + 2);
        int ints = Integer.parseInt(string1);
        double data = Double.valueOf(string);
        if (ints < 5) {
            return (int) Math.floor(data);
        } else {
            return (int) Math.ceil(data);
        }
    }
}