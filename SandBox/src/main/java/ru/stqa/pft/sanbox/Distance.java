package ru.stqa.pft.sanbox;

public class Distance {
    public static void main(String[] args) {
    Point d = new Point(3.1,4,5,6);
        System.out.println("Дистанция между точками П1 с координатами " + d.x1 + " и " + d.y1 + "  " +
                "и точной П2 с коорднатами " + d.x2 + " и " + d.y2 + " = " + d.distance());
    }
}

