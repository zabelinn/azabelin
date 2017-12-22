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
public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter cnt = new Counter();
        int res = cnt.add(1, 10);
        int expected = 30;
        assertThat(30, is(expected));
    }
}
