package ru.job4j.loop;

/**
 *Class Couter
 *@author Alexander Zabelin
 *@since 0.1
 */
public class Counter {
    /**
     * Возвращает сумму четных чисел заданного диапазона
     * @param start начальная позиция
     * @param finish конечная позиция
     * @return сумма четных чисел
     */
    public int add(int start, int finish) {

        int sum = 0;

        for (int i = start; i <= finish; i++) {
            if (i > 0 && i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

