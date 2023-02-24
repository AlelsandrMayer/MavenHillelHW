package net.hliznutsa.hw17;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static net.hliznutsa.hw17.MathArray.matrixCheck;

class MathArrayTest {

    @Test
    void regularMeanArray() {
        MathArray array = new MathArray(new int[]{3, 5, 23, 2, 5, 5});
        double result = array.meanArray();
        Assertions.assertEquals(7.166666666666667, result);
    }

    @Test
    void emptyMeanArray() {
        MathArray array = new MathArray(new int[]{});
        double result = array.meanArray();
        Assertions.assertEquals(0.0, result);
    }

    @Test
    void meanOfNull() {
        MathArray array = new MathArray(null);
        Double result = array.meanArray();
        Assertions.assertEquals(0.0, result);
    }

    @Test
    void squareMatrixCheck() {
        boolean result = matrixCheck(new int[5][5]);
        Assertions.assertFalse(result);
    }

    @Test
    void notSquareMatrixCheck() {
        boolean result = matrixCheck(new int[4][7]);
        Assertions.assertFalse(result);
    }

    @Test
    void nullMatrixCheck() {
        boolean result = matrixCheck(null);
        Assertions.assertFalse(result);
    }

    @Test
    void notSquareWithIntsMatrixCheck() {
        boolean result = matrixCheck(new int[][]{{1, 2, 3}, {1, 2}, {1}});
        Assertions.assertFalse(result);
    }
}