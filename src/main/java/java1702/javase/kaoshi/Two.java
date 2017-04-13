package java1702.javase.kaoshi;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhoumeng on
 * 2017/4/8.
 * 15:37.
 */
public class Two {
    public static void main(String[] args) {
        int a[]={0,1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
        List<Integer> list = new ArrayList<Integer>();
        for(int i =0;i<a.length;i++){
            if(a[i]!=0){
                list.add(a[i]);
            }
        }
        int b[] = new int[list.size()];
        for(int i = 0;i<list.size();i++){
            b[i] = list.get(i);
        }
        System.out.println("原数组：");
        for(int i =0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("去掉值为0后的数组为：");
        for(int i:b){
            System.out.print(i+" ");
        }
    }
}
