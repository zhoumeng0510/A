package java1702.javase.multithreading;

/**
 * Created by zhoumeng on
 * 2017/5/8.
 * 8:56.
 */
public class Test implements Runnable {
    public void main(String[] args) {
        // 进程 process 过程\ ['prəʊses]
        // 线程 thread 线程\ [θred]
        run();

        Test test = new Test();
        Thread thread = new Thread(test);// Runnable
        thread.start();
        System.out.println("test...");

    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
//    private static void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
//    }
}
