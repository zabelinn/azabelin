package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class SquareTest {

    @Test
    public void whenOneAndTwoThenArraySquare() {
        int[] extended = {1, 4, 9, 16};
        int[] res = new Square().calculate(4);
        assertThat(res, is(extended));
    }
}
