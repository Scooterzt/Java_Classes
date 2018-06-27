package ru.stqa.pft.sanbox;

import com.sun.deploy.util.StringUtils;
import org.testng.util.Strings;

public class JavaRush {
    public static final float pi = 3.14f;


    public static void main(String[] args) {
        print("Java easy to learn!");
        print("Java opens many opportunities!");
        salary(1100);
        printCircleLength(5);
        int x = 24, y = 14;
        System.out.println(x + y);
        System.out.println(x * y);
    }

    public static void print(String s) {
        int count = 1;
        while (count <= 7) {
            System.out.println(s);
            count++;
        }
    }

    public static void salary(int a) {
        int b = a + 100;
        System.out.println("Твоя зарплата составляет: " + b + " долларов в месяц.");
    }
    public static void printCircleLength(int radius) {
        double l = 2 * pi * radius;
        System.out.println(l);
    }
}
