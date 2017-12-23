package ru.job4j.array;

import java.util.Arrays;

/**
 *Class ArrayDuplicate
 *@author Alexander Zabelin
 *@since 0.1
 */
public class ArrayDuplicate {

    /**
     * Удалить дубликаты в массиве
     * @param array входной массив
     * @return массив с удаленными дубликатами
     */
    public String[] remove(String[] array) {

        // unique array size
        int uniqueSize = array.length;

        //outer loop
        for (int outerIndex = 0; outerIndex < uniqueSize; outerIndex++) {
            //inner loop
            for (int innerIndexe = outerIndex + 1; innerIndexe < uniqueSize; innerIndexe++) {
                if (array[outerIndex].equals(array[innerIndexe])) {
                    array[innerIndexe] = array[uniqueSize - 1];
                    uniqueSize--;
                    innerIndexe--;
                }
            }
        }
        return Arrays.copyOf(array, uniqueSize);
    }
}
