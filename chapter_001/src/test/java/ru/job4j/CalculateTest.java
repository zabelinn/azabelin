package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
* Test.
*
* @author Alexander Zabelin (zabelinn@yandex.ru)
* @version 0.1
* @since 0.1
*/
public class CalculateTest {
	
	/**
	* Test echo.
	*/ 
	@Test
	public void whenTakeNameThenTreeEchoPlusName() {
		String input = "Alexander Zabelin";
		String expect = "Echo, echo, echo : Alexander Zabelin"; 
		Calculate calc = new Calculate();
		String result = calc.echo(input);
		assertThat(result, is(expect));
	}
 
}
