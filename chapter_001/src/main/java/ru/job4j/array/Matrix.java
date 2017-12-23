package ru.job4j.array;

public class Matrix {

    /**
     * Возвращает матрицу с перемноженными индексами ячеек
     * @param size матрицы
     * @return матрица перемноженный индексов ячеек
     */
    public int[][] multiple(int size) {

        int[][] matrix = new int[size][size];

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                matrix[row - 1][col - 1] = row * col;
            }
        }

        return matrix;
    }
}
