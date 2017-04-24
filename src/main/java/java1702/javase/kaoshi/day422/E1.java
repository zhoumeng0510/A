package java1702.javase.kaoshi.day422;

/**
 * Created by zhoumeng on
 * 2017/4/22.
 * 9:29.
 */
//编写一个没有处理的发生数组下标越界异常的程序
public class E1 {
    public static void main(String[] args) {
        Integer[] ints={1,2,3};
        try {
            System.out.println(ints[4]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
