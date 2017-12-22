package ru.job4j.loop;

/**
 *Class Factorial
 *@author Alexander Zabelin
 *@since 0.1
 */
public class Factorial {
    /**
     * Факториал числа
     * @param n число
     * @return факториал числа
     */
    public int calc(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
