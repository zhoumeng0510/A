package java1702.javase.kaoshi.day56;

/**
 * Created by zhoumeng on
 * 2017/5/6.
 * 16:22.
 */
public class Two {
    public static void main(String[] args) {
        Two two = new Two();
        two.method(2, 5);
        two.method(8, 3, 9);
    }

    private void method(int i, int j) {
        System.out.println(i + j);
    }

    private void method(int i, int j, int k) {
        System.out.println(i + j + k);
    }
}
