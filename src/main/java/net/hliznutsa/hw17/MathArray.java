package net.hliznutsa.hw17;


public class MathArray {

    private final int[] array;

    public MathArray(int[] array) {
        this.array = array;
    }

    public double meanArray() {
        int summArr = 0;
        if (this.array == null || this.array.length == 0) {
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
        if (matrix == null) {
            System.out.print("(Матрица отсутствует)Квадратная ? - ");
            return false;

        } else if (matrix.length == 0 || matrix[0].length == 0) {
            System.out.print("(Матрица нулевая)Квадратная ? - ");
            return false;
        } else {
            for (int[] arr : matrix) {
                if (matrix.length != arr.length) {
                    System.out.print("Матрица квадратная ? - ");
                    return false;
                }
            }
            System.out.print("Матрица квадратная ? - ");
            return true;
        }
    }
}
