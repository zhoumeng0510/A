package java1702.javase.kaoshi.day513;

/**
 * Created by zhoumeng on
 * 2017/5/13.
 * 8:39.
 */
//使用 Thread 类实现多线程
public class One implements Runnable {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new One());
        thread1.setName("test");
        Thread thread2 = new Thread(new One());
        thread2.setName("test");
        thread1.start();
        thread2.start();
        System.out.println("test...");
    }

    @Override
    public void run() {

    }
}
