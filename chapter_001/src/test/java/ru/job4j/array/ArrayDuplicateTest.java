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
public class ArrayDuplicateTest {

    @Test
    public void whenNotDuplicateThenDuplicate() {

        String[] arr = {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] res = new ArrayDuplicate().remove(arr);
        String[] extended = {"Привет", "Мир", "Супер"};
        assertThat(res, is(extended));
    }

}
