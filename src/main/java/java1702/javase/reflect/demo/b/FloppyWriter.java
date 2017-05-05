package java1702.javase.reflect.demo.b;

/**
 * Created by zhoumeng on
 * 2017/5/5.
 * 9:40.
 */
public class FloppyWriter implements DeviceWriter {
    @Override
    public void writeToDevice() {
        System.out.println("write to floppy...");
    }
}
