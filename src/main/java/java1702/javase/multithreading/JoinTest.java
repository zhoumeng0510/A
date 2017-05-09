package java1702.javase.multithreading;

/**
 * Created by zhoumeng on
 * 2017/5/8.
 * 16:39.
 */
public class JoinTest implements Runnable {
    public static void main(String[] args) {
        Thread thread = new Thread(new JoinTest());
        thread.start();

        try {
            thread.join(); // join 加入\ [dʒɒɪn]
        } catch (InterruptedException e) { // interrupt 中断\ [ɪntə'rʌpt]
            e.printStackTrace();
        }

        System.out.println("test...");
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
