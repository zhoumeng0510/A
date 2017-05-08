package java1702.javase.kaoshi.day56;

import java.io.*;
import java.util.Scanner;

/**
 * Created by zhoumeng on
 * 2017/5/6.
 * 15:10.
 */
/*用输入/输出写一个程序,让用户输入一些姓名和电话号码。
每一个姓名和号码将加在文件 里。
用户通过点”Done”按钮来告诉系统整个列表已输入完毕。
如果用户输入完整个列表, 程序将创建一个输出文件并显示或打印出来。格式如:
Tom
123-456-7890
Jerry
987-654-3210*/
public class Three {
    public static void main(String[] args)throws Exception
    {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream (new FileOutputStream("D:/bbs.txt"));
        Scanner scanner=new Scanner(System.in);
        ObjectInputStream ins=new ObjectInputStream(new FileInputStream("D:/bbs.txt"));

        System.out.println("请输入信息(输入Done退出)：");

        while(true)
        {
            Student stu = new Student();
            System.out.println("请输入姓名：");
            stu.setName(scanner.next());
            if( "Done".equals( stu.getName() ) || "done".equals( stu.getName() ) )
            {
                System.out.println("退出录入！");
                break;
            }

            System.out.println("请输入电话号码：");
            stu.setNumber(scanner.next());
            if( "Done".equals( stu.getNumber() ) || "done".equals( stu.getNumber() ) )
            {
                System.out.println("退出录入！");
                break;
            }
            objectOutputStream.writeObject(stu);
        }

        Student student = new Student();
        System.out.println("列表已输入完毕：");
        while( true )
        {
            try{
                student=(Student)ins.readObject();
                System.out.println(student.toString());
            }catch(EOFException e)
            {
                break;
            }
        }

    }
}
class Student implements Serializable
{

    private String name;
    private String number;

    Student(){}

    Student(String name,String number)
    {
        this.name=name;
        this.number=number;
    }
    public String toString()
    {
        return number+","+name;
    }
    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }
    String getNumber() {
        return number;
    }
    void setNumber(String number) {
        this.number = number;
    }
}
