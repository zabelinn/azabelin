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
public class TurnTest {

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turn = new Turn();
        int[] arr = {1, 2, 3};
        int[] res = new Turn().back(arr);
        int[] expected = {3, 2, 1};
        assertThat(res, is(expected));
    }

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turn = new Turn();
        int[] arr = {1, 2, 3, 4};
        int[] res = new Turn().back(arr);
        int[] expected = {4, 3, 2, 1};
        assertThat(res, is(expected));
    }
}
