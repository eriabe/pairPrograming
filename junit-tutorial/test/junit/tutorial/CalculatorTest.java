package junit.tutorial;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void multiply�ŏ�Z���ʂ��擾�ł���() {
		Calculator calc = new Calculator();
		int expected = 12;
		int actual = calc.multiply(3, 4);
		assertThat(actual, is(expected));
	}
	@Test
	public void multiply��5��7�̏�Z���ʂ��擾�ł���() {
		Calculator calc = new Calculator();
		int expected = 35;
		int actual = calc.multiply(5, 7);
		assertThat(actual, is(expected));
	}
	@Test
	public void divide��3��2�̏�Z���ʂ��擾�ł���() {
		Calculator calc = new Calculator();
		float expected = 1.5f;
		float actual = calc.divide(3, 2);
		assertThat(actual, is(expected));
	}
	@Test(expected = IllegalArgumentException.class)
	public void divide��5��0�̂Ƃ�IllegalArgumentException�𑗏o����() {
		Calculator calc = new Calculator();
		calc.divide(5,  0);
	}
}