package java1702.javase.generic;

/**
 * Created by zhoumeng on
 * 2017/4/13.
 * 11:55.
 */
public abstract class GenericInterfaceTest<T extends Number>{
    abstract void method(T t);
}
class GenericInterfaceTestImpl<T extends Number> extends GenericInterfaceTest<T> {

    @Override
    public void method(T t) {

    }
}
