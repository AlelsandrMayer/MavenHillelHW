package org.example.hw17;


public class MathArray {

    private final int[] array;

    public MathArray(int[] array) {
        this.array = array;
    }

    public double meanArray() {
        int summArr = 0;
        if (this.array.length == 0) {
            System.out.print("Пустой массив: ");
            return 0;
        } else {
            for (int i : this.array) {
                summArr += i;
            }
            return (double) summArr / this.array.length;
        }
    }

     public static boolean matrixCheck(int[][] matrix) {
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                matrix[i][j] = (int) (Math.random() * 10);
//                System.out.print(matrix[i][j] + "  ");
//            }
//            System.out.println();
//        }
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        } else {
            return matrix.length == matrix[0].length;
        }
    }
}
