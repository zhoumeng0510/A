package java1702.javase.reflect.demo.a;

/**
 * Created by zhoumeng on
 * 2017/5/5.
 * 9:12.
 * 高层应用类
 */
//强耦合->松散耦合->解耦和
public class Service {
    //    private FloppyWriter floppyWriter; // null
    private PortableHdWriter floppyWriter;

//    public Service(FloppyWriter floppyWriter) {

//    }
//        this.floppyWriter = floppyWriter;
public Service(PortableHdWriter floppyWriter) {
    this.floppyWriter = floppyWriter;
}

    public void write() {
//        floppyWriter.writeToFloppy(); // NPE
        floppyWriter.writeToPortableHd();
    }
}
