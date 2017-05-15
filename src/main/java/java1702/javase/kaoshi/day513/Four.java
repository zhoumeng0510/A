package java1702.javase.kaoshi.day513;

/**
 * Created by zhoumeng on
 * 2017/5/13.
 * 9:17.
 */
//使用 join 方法实现一次阻塞
public class Four implements Runnable {
    public static void main(String[] args) {
        Thread thread = new Thread(new Four());
        thread.start();
        try {
            thread.join(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread());
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
