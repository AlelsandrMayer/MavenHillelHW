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

        Assertions.assertEquals(6.4031242374328485, result, 0.001);
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

        Assertions.assertEquals(3.605551275463989, result, 0.001);
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
    void testEqualsTrue() {
        Point point1 = new Point(5, 7);
        Point point2 = new Point(5, 7);
        Point point3 = new Point(5, 7);

        boolean resultReflexivity = point1.equals(point1);

        boolean resultSymmetry1 = point1.equals(point2);
        boolean resultSymmetry2 = point2.equals(point1);

        boolean resultTransitivity1 = point1.equals(point2);
        boolean resultTransitivity2 = point2.equals(point3);
        boolean resultTransitivity3 = point1.equals(point3);

        boolean resultConsistency1 = point3.equals(point1);
        boolean resultConsistency2 = point3.equals(point1);

        Assertions.assertTrue(resultReflexivity);
        Assertions.assertTrue(resultSymmetry1);
        Assertions.assertTrue(resultSymmetry2);
        Assertions.assertTrue(resultTransitivity1);
        Assertions.assertTrue(resultTransitivity2);
        Assertions.assertTrue(resultTransitivity3);
        Assertions.assertTrue(resultConsistency1);
        Assertions.assertTrue(resultConsistency2);
    }

    @Test
    void testEqualsFalse() {
        Point point1 = new Point(5, 5);
        Point point2 = new Point(5, 8);
        Point point3 = new Point(7, 7);

        boolean resultSymmetry1 = point1.equals(point2);
        boolean resultSymmetry2 = point2.equals(point1);

        boolean resultTransitivity1 = point1.equals(point2);
        boolean resultTransitivity2 = point2.equals(point3);
        boolean resultTransitivity3 = point1.equals(point3);

        boolean resultConsistency1 = point3.equals(point1);
        boolean resultConsistency2 = point3.equals(point1);
        boolean resultNull = point1.equals(null);

        Assertions.assertFalse(resultSymmetry1);
        Assertions.assertFalse(resultSymmetry2);
        Assertions.assertFalse(resultTransitivity1);
        Assertions.assertFalse(resultTransitivity2);
        Assertions.assertFalse(resultTransitivity3);
        Assertions.assertFalse(resultConsistency1);
        Assertions.assertFalse(resultConsistency2);
        Assertions.assertFalse(resultNull);
    }

    @Test
    void testHashCode() {
        Point point1 = new Point(8, 15);
        Point point2 = new Point(8, 15);
        Point point3 = new Point(5, 11);

        int resultConsistency1 = point1.hashCode();
        int resultConsistency2 = point1.hashCode();

        boolean resultEqualsBoolean = point1.equals(point2);
        int resultEqualsInt = point2.hashCode();

        boolean resultNotEqualsBoolean = point1.equals(point3);
        int resultNotEqualsInt = point3.hashCode();

        Assertions.assertEquals(resultConsistency1, resultConsistency2);
        Assertions.assertTrue(resultEqualsBoolean);
        Assertions.assertEquals(resultConsistency1, resultEqualsInt);
        Assertions.assertFalse(resultNotEqualsBoolean);
        Assertions.assertNotEquals(resultEqualsInt, resultNotEqualsInt);
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