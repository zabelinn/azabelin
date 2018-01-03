package ru.job4j.loop;

/**
 *Class Contains
 *@author Zabelin Alexander
 *@since 0.1
 */
public class Contains {

    /**
     * Returns true when param origin contains param sub
     * @param origin
     * @param sub
     * @return
     */
    public boolean contains(String origin, String sub) {
        // write result here
        boolean res = false;

        char[] originArr = origin.toCharArray();
        char[] subArr = sub.toCharArray();

        int lenOrigin = originArr.length;
        int lenSub = subArr.length;

        int inner = 0;

        for (int outer = 0; outer <= lenOrigin - lenSub && !res; outer++) {
            while (originArr[outer] == subArr[inner]) {
                outer++;
                inner++;

                if (inner == lenSub) {
                    // origin contains sub
                    res = true;
                    break;
                }
            }
            // reset inner counter
            inner = 0;
        }
        return res;
    }
}
