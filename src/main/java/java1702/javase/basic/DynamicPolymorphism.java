package java1702.javase.basic;

/**
 * Created by zhoumeng on
 * 2017/4/24.
 * 10:53.
 */
public class DynamicPolymorphism {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        superClass.method();

        SubClass1 subClass1 = new SubClass1();
        subClass1.method();

        SubClass2 subClass2 = new SubClass2();
        subClass2.method(); //
    }
}

class SuperClass extends Object {

    public void method() {
        System.out.println("method in super class...");
    }
}

class SubClass1 extends SuperClass {

//    public void method() { // overwrite 重写 override 覆盖 overload 重载
//        System.out.println("method in sub class 1...");
//    }

    public int method(int i) {
        return 0;
    }
}

class SubClass2 extends SuperClass {

    // Ctrl + O / Ctrl + O
    @Override
    public void method() {
        System.out.println("method in sub class 2...");
        super.method();
    }
}
