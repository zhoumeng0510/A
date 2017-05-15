package java1702.javase.kaoshi.day513;

/**
 * Created by zhoumeng on
 * 2017/5/13.
 * 8:59.
 */
//. 使用 sleep 方法实现一次阻塞
public class Three extends Thread {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Three());
        Thread thread2 = new Thread(new Three());
        thread1.start();
        thread2.start();
    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName()+i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}




