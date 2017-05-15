package java1702.javase.kaoshi.day513;

/**
 * Created by zhoumeng on
 * 2017/5/13.
 * 8:54.
 */
//使用 Runnable 接口实现多线程
public class Two implements Runnable {
    public static void main(String[] args) {
        Two two = new Two();
        new Thread(two).run();
        new Thread(two).run();
        new Thread(two).run();
    }

    @Override
    public void run() {

    }
}
