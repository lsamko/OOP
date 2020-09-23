package Lesson8;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat("Vaska", 5);
        Cat cat2 = new Cat("Vaska", 5);
        System.out.println(cat);
        System.out.println(cat.hashCode());
        System.out.println(cat2.hashCode());

        System.out.println(cat == cat2);
        System.out.println(cat.equals(cat2));
        System.out.println("---------------------------------------");

        Cat cat3 = null;
        try {
            cat3 = cat.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("Cat 3 = " + cat3);
        System.out.println(cat3 != cat);
        System.out.println(cat3.getClass() == cat.getClass());
        System.out.println(cat3.equals(cat));
        cat3.setAge(10);
        System.out.println(cat3);
        System.out.println("---------------------------------------");

        Class catClass = cat.getClass();
        Field[] fields = catClass.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i]);
        }

        System.out.println("---------------------------------------");

        Method[] methods = catClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("---------------------------------------");

        Class[] interfaces = catClass.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println(anInterface);
            if (anInterface.equals(Cloneable.class)) {
                System.out.println("Cat cloneable is ON");
            }
        }
        System.out.println("---------------------------------------");

        try {
            Field catAge = catClass.getDeclaredField("age");
            catAge.setAccessible(true);
            catAge.setInt(cat, 500);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
        }

        System.out.println(cat);
    }
}
