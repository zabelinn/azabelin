package ru.job4j.array;
/**
 * *
 *Class Turn
 *@author Alexander Zabelin
 *@since 0.1
 */
public class Turn {
    /**
     * Разворачивает массив в обратную сторону
     * @param array массив
     * @return развернутый массив
     */
    public int[] back(int[] array) {
        int temp;
        int len = array.length;

        for (int i = 0; i <= (len / 2) - 1; i++) {
            temp = array[i];
            array[i] = array[len - i - 1];
            array[len - i - 1] = temp;
        }
        return array;
    }

}
