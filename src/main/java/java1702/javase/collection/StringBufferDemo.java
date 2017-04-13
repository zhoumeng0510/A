package java1702.javase.collection;

/**
 * Created by zhoumeng on
 * 2017/4/8.
 * 8:53.
 */
class E3 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("hello");//  实例 ； 初始化一个字符串
        stringBuffer.append(" world");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.delete(5 , 6));// Ctrl + Q 查看文档
        System.out.println(stringBuffer.insert(5 , ","));// offset 偏移量  insert 添加一些东西
        System.out.println(stringBuffer.insert(stringBuffer.length(),"!"));
        System.out.println(stringBuffer.reverse());
        stringBuffer.reverse().setCharAt(0,'H');// 手写字母变大写
        System.out.println(stringBuffer);
    }
}
