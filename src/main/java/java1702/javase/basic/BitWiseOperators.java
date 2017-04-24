package java1702.javase.basic;

/**
 * Created by zhoumeng on
 * 2017/4/24.
 * 10:48.
 */
public class BitWiseOperators {
    public static void main(String[] args) {
        // Bit 位\ [bɪt] 比特 Byte 字节\ [baɪt] 1 Byte = 8 Bit
        // 1KB = 1024 Byte MB = 1024KB GB TB PB
        // 00000000
        // 2^31 - 1  -2^31

        int x = 1;
        int y = 1;
//        0000...|1
        System.out.println(x >> y); // 按位与 按位左移 无符号右移
//        System.out.println(~x);

        System.out.println(Integer.toBinaryString(-1));
        // 000..01 ~ 111...10 -2
        // 000..10
        //      00
        //      11
        //      11

//        2 -2
        // 000...10 111...01 111...10

//      1  -1
//        000...1 111...0 1111...|1

//        [1001.....010100] <<
    }
}
