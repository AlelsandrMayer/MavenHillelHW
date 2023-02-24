package net.hliznutsa.hw16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static net.hliznutsa.hw16.Point.pointDistance;

class PointTest {

    @Test
    void testSetX() {
        Point setxPoint = new Point(5, 7);
        setxPoint.setX(4);
        Assertions.assertEquals(4, setxPoint.getX());
    }

    @Test
    void testSetY() {
        Point setyPoint = new Point(5, 7);
        setyPoint.setY(9);
        Assertions.assertEquals(9, setyPoint.getY());
    }

    @Test
    void testGetX() {
        Point getxPoint = new Point(5, 7);
        Assertions.assertEquals(5, getxPoint.getX());
    }

    @Test
    void testGetY() {
        Point getyPoint = new Point(1, 2);
        Assertions.assertEquals(2, getyPoint.getY());
    }

    @Test
    void testPointDistance() {
        Point point1 = new Point(5, 7);
        Point point2 = new Point(9, 2);
        double result = pointDistance(point1, point2);
        Assertions.assertEquals(6.4031242374328485, result);
    }

    @Test
    void testPointDistanceNull() {
        double result = pointDistance(null, null);
        Assertions.assertEquals(0, result);
    }

    @Test
    void testPointDistanceOneNull() {
        Point point1 = new Point(5, 7);
        double result = pointDistance(point1, null);
        Assertions.assertEquals(0, result);
    }

    @Test
    void testPointDistanceZero() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(0, 0);
        double result = pointDistance(point1, point2);
        Assertions.assertEquals(0, result);
    }

    @Test
    void testPointDistanceMinusInt() {
        Point point1 = new Point(-7, -8);
        Point point2 = new Point(-10, -6);
        double result = pointDistance(point1, point2);
        Assertions.assertEquals(3.605551275463989, result);
    }


    @Test
    void testPointDistanceOnePoint() {
        Point point1 = new Point(11, 9);
        Point point2 = new Point(7, 6);
        double result = point2.pointDistanceOnePoint(point1);
        Assertions.assertEquals(5, result);
    }

    @Test
    void testPointDistanceOnePointNull() {
        Point point = new Point(7, 6);
        double result = point.pointDistanceOnePoint(null);
        Assertions.assertEquals(0, result);
    }


    @Test
    void testEqualsFalse() {
        Point point1 = new Point(11, 9);
        Point point2 = new Point(7, 6);
        boolean result = point1.equals(point2);
        Assertions.assertFalse(result);
    }

    @Test
    void testEqualsTrue() {
        Point point1 = new Point(5, 7);
        Point point2 = new Point(5, 7);
        boolean result = point1.equals(point2);
        Assertions.assertTrue(result);
    }

    @Test
    void testEqualsTrueNull() {
        Point point1 = new Point(5, 7);
        boolean result = point1.equals(null);
        Assertions.assertFalse(result);
    }

    @Test
    void testHashCode() {
        Point point1 = new Point(8, 15);
        int result = point1.hashCode();
        Assertions.assertEquals(263, result);
    }

    @Test
    void testToString() {
        Point point1 = new Point(8, 15);
        String result = point1.toString();
        Assertions.assertEquals("X = 8  Y = 15", result);
    }

    @Test
    void testClone() throws CloneNotSupportedException {
        Point point1 = new Point(8, 15);
        Point clonePoint1 = point1.clone();
        Assertions.assertEquals(point1, clonePoint1);
    }
}