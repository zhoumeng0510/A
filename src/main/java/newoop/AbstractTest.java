package newoop;

/**
 * Created by zhoumeng on
 * 2017/4/6.
 * 9:13.
 */
public abstract class AbstractTest {
    private int i;

    public AbstractTest(int i) {
        this.i = i;
    }
    public abstract void method(String s, boolean b);

    public abstract void method(String s);

    public static void main(String[] args) {
//        AbstractTest abstractTest = new AbstractTest(); // instantiated 实例化
        SubAbstractTest subAbstractTest = new SubAbstractTest(1);
    }
}

class SubAbstractTest extends AbstractTest {

    public SubAbstractTest(int i) {
        super(i);
    }

    @Override
    public void method(String s, boolean b) {

    }

    @Override
    public void method(String s) {

    }
}
