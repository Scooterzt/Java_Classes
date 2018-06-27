package ru.stqa.pft.sanbox;

public class Distance {
    public static void main(String[] args) {
        Point point1 = new Point(-3,-5);
        Point point2 = new Point(4,5);
        double distance = Point.distance(point1,point2);
        System.out.println("Дистанция между точками П1 с координатами " + point1.x + " и " + point1.y + "  " +
                "и точной П2 с коорднатами " + point2.x + " и " + point2.y + " = " + distance);
    }
}

