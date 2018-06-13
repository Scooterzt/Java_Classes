package ru.stqa.pft.sanbox;


public class MyFirstJava {


    public static void main(String[] args) {

        System.out.println("Hello Roman");
                helloW("Roman");
                helloW("Nata");
                helloW("Serg");

                Square s = new Square(3);

        System.out.println("площадь квадрата со стороной " + s.l + " ровна " + s.area());

        Rectangle r = new Rectangle(4,6);

        System.out.println("площадь прямоугольника со сторонами " + r.a + " и " + r.b +  " ровна " + r.area());
        }



    public static void helloW(String someone){
        System.out.println("Hey " + someone + " it's working");
    }


}
