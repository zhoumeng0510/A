package java1702.javase.collection;

/**
 * Created by zhoumeng on
 * 2017/4/28.
 * 13:41.
 */
public class ArrayTest {
    // array 数组\ [ə'reɪ]
    public static void main(String[] args) {
        String[] strings;
        strings = new String[10];
        strings[0] = "test...";
        System.out.println(strings[0]); // 下标 索引 index

        boolean[] booleans = new boolean[10000];
        booleans[0] = true;
        System.out.println(booleans[99]); // ?

        int[] ints = {1, 2, 3, 4, 5, 6, 67777, 888};
        System.out.println(ints[6]);

        double[] doubles = new double[1000];
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = i + 1;
        }
        System.out.println("--->" + doubles[doubles.length - 1]);
        for (int i = 0; i < doubles.length; i++) {
            System.out.println(doubles[i]);
        }


        ArrayTest[] arrayTests = {new ArrayTest(), new ArrayTest(), new ArrayTest()};
//        arrayTests[0] = new ArrayTest();
        System.out.println(arrayTests[0]); // java1702.javase.collection.ArrayTest@
        System.out.println(arrayTests[1]); // ?
        System.out.println(arrayTests[2]); // ?
        System.out.println(arrayTests.length);

        String[] months = {"Jan", "Feb", "Mar", "Apr", "May"};

        // itar + tab
        for (int i = 0; i < months.length; i++) {
            String month = months[i];
            System.out.println(month);
        }

        System.out.println("-------------");

        // iter + tab
        for (String month : months) {
            System.out.println(month);
        }

        int[] monthDays = {31, 28};

        Object[] objects = new Object[10];
        objects[0] = 1;
        objects[1] = 1.2;
        objects[2] = "hello";
        objects[3] = new ArrayTest(); // FQN@HEX

        for (int i = 0; i < objects.length; i++) {
            if (i == 5) {
                System.out.println(objects[i]);
            }
        }

        for (Object object : objects) {
            System.out.println(object);
        }
//        itar iterate 迭代\ ['ɪtəreɪt] array
    }
}
