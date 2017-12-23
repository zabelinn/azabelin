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
public class MatrixTest {

    @Test
    public void whenSize2Then1224() {

        int[][] matrix = new int[2][2];
        int[][] res = new Matrix().multiple(2);
        int[][] expected = {{1, 2}, {2, 4}};
        assertThat(res, is(expected));
    }

}
