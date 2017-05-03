package java1702.javase.reflect;

import java.lang.reflect.Field;

/**
 * Created by zhoumeng on
 * 2017/5/3.
 * 17:32.
 */
class Animals {
    public int age;
    private  double weight;

    public Animals() {
    }

    public Animals(int age,double weight) {
        this.age=age;
        this.weight=weight;
    }

    public int sleep(int hours) {
        return hours;
    }

    public void eat(String food) {
        System.out.println("eating"+ food);
    }

    private void killHuman() {
        System.out.println("killed a poor guy...");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
public class Human extends Animals {
    public String name;
    private boolean married;

    public Human() {
    }

    public Human(int age,double weight,String name,boolean married) {
        super(age,weight);
        this.name=name;
        this.married=married;
    }

    @Override
    public void eat(String food) {
        System.out.println(name+"is now eating"+food);
    }
}

class HumanTest {
    public static void main(String[] args) {
        Human human = new Human();
        Class clazz= human.getClass();
        Field[] fields=clazz.getFields();
        System.out.println("----getFields()----");
        for (Field field : fields) {
            System.out.println(field.getName());
        }
        Field[] declaredFields = clazz.getDeclaredFields();
        System.out.println("----getDeclareFields()----");
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName());
        }
    }
}
