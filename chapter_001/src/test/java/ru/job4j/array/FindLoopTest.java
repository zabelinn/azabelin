package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Alexander Zabelin (zabelinn@yandex.ru)
 * @version 0.1
 * @since 0.1
 */
public class FindLoopTest {

    @Test
    public void whenIndexOfSearchElementIsTwo() {
        int[] data = {1, 2, 3};

        int res = new FindLoop().indexOf(data, 3);
        int expected = 2;

        assertThat(res, is(expected));
    }

    @Test
    public void whenIndexOfSearchElementIsMinusOne() {
        int[] data = {1, 2, 3};

        int res = new FindLoop().indexOf(data, 4);
        int expected = -1;

        assertThat(res, is(expected));
    }

}
