package java1702.javase.reflect;
import java1702.javase.basic.Human;
/**
 * Created by zhoumeng on
 * 2017/5/3.
 * 16:30.
 */
public class Chinese extends Human {
    private int i;

    public Chinese(int i) {
        this.i = i;
    }

    public void m(String s) {
        System.out.println(s);
    }
} // Class<Chinese> chinese;

class ChineseTest { // Run time 运行时
    public static void main(String[] args) throws ClassNotFoundException {
        Chinese chinese = new Chinese(1);
        Class<Chinese> chineseClass1 = Chinese.class;
        Class chineseClass2 = chinese.getClass();
        Class chineseClass3 = Class.forName("java1702.javase.reflect.Chinese");


    }
}

// ArrayList


// 1. 编辑 Chinese.java
// 2. 编译 Chinese.class byte code
// 3. 运行