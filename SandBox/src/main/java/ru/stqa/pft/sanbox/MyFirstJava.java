package ru.stqa.pft.sanbox;


public class MyFirstJava {


    public static void main(String[] args) {

        System.out.println("Hello Roman");
                helloW("Roman");
                helloW("Nata");
                helloW("Serg");
                double len = 3;
        System.out.println("площадь квадрата со стороной " + len + " ровна " + area(len));

        double a = 6;
        double b = 12;
        System.out.println("площадь прямоугольника со сторонами " + a + " i " + b +  " ровна " + area(a,b));
        }



    public static void helloW(String someone){
        System.out.println("Hey " + someone + " it's working");
    }
    public static double area (double s){
        return s*s;
    }
    public static double area (double a, double b){
        return a * b;
    }
}
