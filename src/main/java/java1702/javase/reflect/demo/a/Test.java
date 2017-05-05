package java1702.javase.reflect.demo.a;

/**
 * Created by zhoumeng on
 * 2017/5/5.
 * 9:15.
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
//        Service service = new Service(new FloppyWriter());
        Service service = new Service(new PortableHdWriter());
        service.write();
    }
}
