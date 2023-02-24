package org.example.hw17;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.hw17.MathArray.matrixCheck;

class MathArrayTest {

    @Test
    void meanArray1() {
        MathArray array = new MathArray(new int[]{3, 5, 23, 2, 5, 5});
        double result = array.meanArray();
        Assertions.assertEquals(7.166666666666667, result);
    }
    @Test
    void meanArray2() {
        MathArray array = new MathArray(new int[]{});
        double result = array.meanArray();
        Assertions.assertEquals(0, result);
    }

    //    @Test
//    void matrixCheck1() {
//        boolean result = matrixCheck(new int[5][5]);
//       Assertions.assertFalse(false);
//    }
//
    @Test
    void matrixCheck2() {
        boolean result = matrixCheck(new int[4][7]);
        Assertions.assertFalse(result);
    }
}