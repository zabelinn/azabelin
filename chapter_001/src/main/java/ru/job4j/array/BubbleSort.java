package ru.job4j.array;

/**
 *Class BubbleSort
 *@author Alexander Zabelin
 *@since 0.1
 */
public class BubbleSort {

    /**
     * Сортируем массив методом пузырька
     * @param array исходный массив
     * @return отсортированный массив
     */
    public int[] sort(int[] array) {

        int len = array.length;
        int temp;

        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }
}
