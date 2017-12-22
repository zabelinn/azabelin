package ru.job4j.loop;

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
public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int res = new Factorial().calc(5);
        int exptected = 120;
        assertThat(res, is(exptected));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int res = new Factorial().calc(0);
        int exptected = 1;
        assertThat(res, is(exptected));
    }
}


