package java1702.javase.multithreading;

/**
 * Created by zhoumeng on
 * 2017/5/8.
 * 10:08.
 */
public class SubThread extends Thread{

    public static void main(String[] args) {
        SubThread subThread = new SubThread();
        subThread.start();
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
