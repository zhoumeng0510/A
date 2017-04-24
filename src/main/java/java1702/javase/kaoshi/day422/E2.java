package java1702.javase.kaoshi.day422;

/**
 * Created by zhoumeng on
 * 2017/4/22.
 * 9:43.
 */
//编写一个正确处理的产生空指针异常的程序
public class E2 {
    public static void main(String []argv){
        java.util.Date date=null;
        try{
            System.out.println("DateTime in long:"+date.getTime());
        }catch(NullPointerException ne){
//            System.out.println("  Except happened:"+ne);
        }
    }
}