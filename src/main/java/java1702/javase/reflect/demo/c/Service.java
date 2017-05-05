package java1702.javase.reflect.demo.c;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * Created by zhoumeng on
 * 2017/5/5.
 * 10:51.
 */
public class Service {
    public void write() {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src/main/java/java1702/javase/reflect/demo/c/config.properties"));
            String className = properties.getProperty("className");
            String methodName = properties.getProperty("methodName");

            Class clazz = Class.forName(className);
            Method method = clazz.getDeclaredMethod(methodName);
            Constructor constructor = clazz.getDeclaredConstructor();
            method.invoke(constructor.newInstance());
        } catch (IOException | ClassNotFoundException | InvocationTargetException | InstantiationException | IllegalAccessException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
