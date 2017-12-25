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
public class ContainsTest {
    @Test
    public void whenContainsIsTrueOnLeft() {
        boolean res = new Contains().contains("111222333", "111");
        assertThat(res, is(true));
    }

    @Test
    public void whenContainsIsTrueOnRight() {
        boolean res = new Contains().contains("111222333", "333");
        assertThat(res, is(true));
    }

    @Test
    public void whenContainsIsTrueOnCenter() {
        boolean res = new Contains().contains("Привет", "иве");
        assertThat(res, is(true));
    }

    @Test
    public void whenContainsIsFalse() {
        boolean res = new Contains().contains("Привет", "иве!");
        assertThat(res, is(false));
    }

}
