package ru.job4j.max;

/**
 *Class Max
 *@author Zabelin Alexander
 *@since 0.1
 */
public class Max {

    /**
     * Выбрать максимальное число из двух чисел.
     * @param first число для сравнения.
     * @param second число для сравнения.
     * @return максимальное число.
     */
    public int max(int first, int second) {
        return first > second ? first : second;
    }

}
