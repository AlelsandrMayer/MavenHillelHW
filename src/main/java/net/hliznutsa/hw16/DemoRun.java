package net.hliznutsa.hw16;

import static net.hliznutsa.hw16.Point.pointDistance;

public class DemoRun {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point firstPoint = new Point(4, 4);
        Point secondPoint = new Point(0, 0);

//        firstPoint.setX();
//        firstPoint.setY();
//        secondPoint.setX();
//        secondPoint.setY();

        System.out.println(firstPoint);
        System.out.println(secondPoint);
        System.out.println("Расстояние к точке: " + firstPoint.pointDistanceOnePoint(secondPoint));
        System.out.println("Расстояние между точками: " + pointDistance(null, null));
        System.out.println("Координаты точек равны: " + firstPoint.equals(secondPoint));

        Point cloneFirstPoint = firstPoint.clone();
        System.out.println("Первая точка и её клон равны: " + firstPoint.equals(cloneFirstPoint));
    }
}