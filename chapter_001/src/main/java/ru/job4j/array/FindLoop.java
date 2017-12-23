package ru.job4j.array;
/** *
 *Class FindLoop
 *@author Alexander Zabelin
 *@since 0.1
 */
public class FindLoop {

    /**
     * Возвращает индекс искомого элемента в массиве
     * @param data массив
     * @param el искомый элемент
     * @return индекс элемента в массиве
     */
    public int indexOf(int[] data, int el) {

        int rsl = -1; // если элемента нет в массиве, то возвращаем -1.

        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rsl = index;

                break;
            }
        }

        return rsl;
    }
}
