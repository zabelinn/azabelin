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
public class BubbleSortTest {

    @Test
    public void whenArray54321Then12345() {
        int[] arr = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        arr = new BubbleSort().sort(arr);
        assertThat(arr, is(expected));
    }
}
