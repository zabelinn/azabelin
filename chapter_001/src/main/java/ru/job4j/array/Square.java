package ru.job4j.array;

/**
 *Class Square
 *@author Alexander Zabelin
 *@since 0.1
 */
public class Square {

    /**
     * Вернуть массив элементов возведенных в квадрат
     * @param bound верхняя граница массива
     * @return массив элементов возведенных в квадрат
     */
    public int[] calculate(int bound) {

        int[] rst = new int[bound];

        for (int i = 1; i <= bound; i++) {
            rst[i - 1] = i * i;
        }
        return rst;
    }
}
