package net.hliznutsa.hw16;

public class Point implements Cloneable {
    private int x;
    private int y;

    public Point(int x, int y) {
        setX(x);
        setY(y);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    static double pointDistance(Point firstPoint, Point secondPoint) {
        if (firstPoint == null || secondPoint == null) {
            System.out.print("Указано меньше двух точек:  ---  ");
            return 0;
        } else {
            int summaX = firstPoint.getX() - secondPoint.getX();
            int summaY = firstPoint.getY() - secondPoint.getY();
            int summaXy = (summaX * summaX) + (summaY * summaY);
            return Math.sqrt(summaXy);
        }
    }

    public double pointDistanceOnePoint(Point point) {
        return pointDistance(this, point);
    }

    @Override
    public boolean equals(Object o) {
        boolean result = false;
        if (this == o) {
            result = true;
        } else if (o instanceof Point) {
            Point point = (Point) o;
            if (getX() == point.getX()) {
                result = getY() == point.getY();
            }
        }
        return result;
    }

    @Override
    public int hashCode() {
        int result = getX();
        result = 31 * result + getY();
        return result;
    }

    @Override
    public String toString() {
        return "X = " + this.x + "  Y = " + this.y;
    }

    @Override
    public Point clone() throws CloneNotSupportedException {
        return (Point) super.clone();
    }
}

