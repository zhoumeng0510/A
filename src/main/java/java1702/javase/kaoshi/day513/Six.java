package java1702.javase.kaoshi.day513;

/**
 * Created by zhoumeng on
 * 2017/5/13.
 * 9:38.
 */
/*编写一个程序，子线程循环 10 次，接着主线程循环 100 次，
接着又回到子线程循环 10 次，接着再回到主线程又循环 100 次，如此循环50次*/
public class Six implements Runnable{
    public static void main(String[] args) {
        Thread thread = new Thread(new Six());
        thread.start();
        for (int i = 1; i < 101; i++) {
            System.out.println(i);
        }
    }
    @Override
    public void run() {
        for (int i = 1; i < 51; i++) {
            System.out.println(Thread.currentThread().getName()+"running...");
            if (i % 10 == 0) {
                Thread.yield();
            }
        }
    }
}

