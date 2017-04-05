import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by zhoumeng on
 * 2017/4/5.
 * 11:03.
 */
public class SuperClass {
    int i;

//    public SuperClass(){
//
//    }

    public SuperClass(int i) {
        this.i = i;
        System.out.println("in super class constructor...");
    }

    public void method() {
        System.out.println("method...");
    }
}

class SubClass extends SuperClass {
    private boolean b;

    public SubClass(int i, boolean b) {
//        super(); // { }
        super(i);
        this.b = b;
        System.out.println("in sub class constructor...");
    }

    public void m() {
        System.out.println("m...");
    }

    @Override
    public void method() {
        System.out.println("test...");
        super.method();
    }

    public boolean getB() {
        return b;
    }
}

class Test {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass(1);
//        System.out.println(superClass.i); // 1
        superClass.method();

        SubClass subClass = new SubClass(1,true);
//        System.out.println(subClass.i); // 1 2
//        System.out.println(subClass.getB());
        subClass.method();
//        subClass.m();
    }
}
