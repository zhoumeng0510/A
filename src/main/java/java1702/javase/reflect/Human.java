package java1702.javase.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;

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
     /*
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Human human = new Human();
        Class clazz = human.getClass();
        Field[] fields = clazz.getFields();
        System.out.println("--- getFields() ---");
        for (Field field : fields) {
            System.out.println(field.getName());
        }
        Field[] declaredFields = clazz.getDeclaredFields(); // declared 宣布\ [dɪ'kleəd] 声明
        System.out.println("--- getDeclaredFields() ---");
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName());
        }
        List<Integer> list = new ArrayList<>();
//        Field array = list.getClass().getDeclaredField("elementData");
        Field array = ArrayList.class.getDeclaredField("elementData");
        array.setAccessible(true);
        System.out.println("list capacity: " + ((Object[]) array.get(list)).length); // 10
        Vector<String> vector = new Vector<>();
        vector.add("hi");
        System.out.println(vector.size());
        System.out.println(vector.capacity());
    }*/

    public static void main(String[] args) throws NoSuchMethodException {
        Class clazz = Human.class;

        Constructor[] constructors = clazz.getConstructors();
        System.out.println("-- getConstructors() ---");
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName());
            for (Parameter parameter : constructor.getParameters()) {
                System.out.println("\t" + parameter);
            }
        }

        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        System.out.println("-- getDeclaredConstructors() ---");
        for (Constructor constructor : declaredConstructors) {
            System.out.println(constructor.getName());
            for (Parameter parameter : constructor.getParameters()) {
                System.out.println("\t" + parameter.getName());
            }
        }

        Constructor constructor = clazz.getDeclaredConstructor(int.class, double.class, String.class, boolean.class);
        System.out.println(constructor.getName());
        for (Parameter parameter : constructor.getParameters()) {
            System.out.println(parameter);
        }

        // constructor - object
//        Human human =
    }
}
