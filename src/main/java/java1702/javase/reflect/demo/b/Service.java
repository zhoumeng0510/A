package java1702.javase.reflect.demo.b;

/**
 * Created by zhoumeng on
 * 2017/5/5.
 * 9:42.
 */
public class Service {
    private DeviceWriter deviceWriter;

//    public Service(DeviceWriter deviceWriter) {
//        this.deviceWriter = deviceWriter;
//    }

    public void setDeviceWriter(DeviceWriter deviceWriter) {
        this.deviceWriter = deviceWriter;
    }

    public void write() {
        deviceWriter.writeToDevice();
    }
}
