package java1702.javase.kaoshi.day513;

/**
 * Created by zhoumeng on
 * 2017/5/13.
 * 10:11.
 */
/*
编写一个程序，开启3个线程，这3个线程的 Name 分别为 A、B、C，每个线程将自己的 Name 在屏幕上打印10遍，要求输出结果必须按
        ABC 的顺序显示；如：ABCABC….依次递推
*/
public class Seven implements Runnable{
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Seven());
        Thread thread2 = new Thread(new Seven());
        Thread thread3 = new Thread(new Seven());
        thread1.setName("A");
        thread2.setName("B");
        thread3.setName("C");
        thread1.start();
        thread2.start();
        thread3.start();
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
