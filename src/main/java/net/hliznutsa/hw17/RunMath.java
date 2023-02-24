package net.hliznutsa.hw17;

import static net.hliznutsa.hw17.MathArray.matrixCheck;

public class RunMath {
    public static void main(String[] args) {
        MathArray array1 = new MathArray(null);
        MathArray array2 = new MathArray(new int[]{3, 2, 5, 7, 34, 67, 76});
        System.out.println(array1.meanArray());
        System.out.println(array2.meanArray());

        System.out.println(matrixCheck(null));
        System.out.println(matrixCheck(new int[5][5]));
        System.out.println(matrixCheck(new int[][]{{1, 2, 3}, {1, 2}, {1}}));
    }
}