package java1702.javase.reflect.demo.b;

/**
 * Created by zhoumeng on
 * 2017/5/5.
 * 9:42.
 */
public class Test {
    public static void main(String[] args) {
        Service service = new Service();
        service.setDeviceWriter(new PortableHdWriter());
        service.write();
    }
}
