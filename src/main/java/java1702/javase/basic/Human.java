package java1702.javase.basic;

/**
 * Created by zhoumeng on
 * 2017/5/3.
 * 16:56.
 */
// 类 分类 类别 类型 人类
// 人类
// 特征或属性：五官 四肢 头 思想 性格
// 行为或功能：行走 做饭 闻 看 睡觉

// class = field(s) + method(s)
// 类 = 域 + 方法
public class Human {
    // 1. 域 field
    String name;
    double height;
    boolean isMarried;
    char gender; // 性别 男 女 Male Female
    int age;
    double weight;

    // 2.1 构造方法
    public Human(String s, double d) {
        name = s;
        height = d;
    }
/*
    public java1702.javase.basic.Human(String name, double height, boolean isMarried, char gender, int age, double weight) {
        this.name = name; // null
        this.height = height; // 0.0
        this.isMarried = isMarried; // false
        this.gender = gender; // 0
        this.age = age; // 0
        this.weight = weight; // 0.0
    }
    */

    // Command + N / Alt + Insert

    public Human(String name, double height, boolean isMarried, char gender, int age, double weight) {
        this.name = name;
        this.height = height;
        this.isMarried = isMarried;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
    }

    public Human(String name, double height, boolean isMarried) {
        this.name = name;
        this.height = height;
        this.isMarried = isMarried;
    }

    public Human() {

    } // 默认构造方法

    // 2.2 成员方法 method
    public void think(int i) { // void 空 不返回任何值
        // .think(1);
//        return;
    }

    public void sing(double d, boolean b) {
        // .sing(1.2, true);
        // .sing(false, 2.3);
    }

    public void work(byte b, short s, String str) {
        // .work(123, 456, "test"):
    }

    public void sleep() {
        // .sleep();
        long test = 1L;
        return;
    }

    public void study() {
        // ...
        int x = 1;
        int y = 2;
        // ...
        if (x + y == 3) {
            System.out.println("语句一");
            return;
        }
        System.out.println("语句二");
    }

    public void run() {

    }
}