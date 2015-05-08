package pairPrograming;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class IntToEngTest {

	@Test
	public void test1() {
		IntToEng ite = new IntToEng();
		String expected = "one";
		String actual = ite.translateEng(1);
		assertThat(actual, is(expected));
	}
	@Test
	public void test21() {
		IntToEng ite = new IntToEng();
		String expected = "twenty one";
		String actual = ite.translateEng(21);
		assertThat(actual, is(expected));
	}
	@Test
	public void test598() {
		IntToEng ite = new IntToEng();
		String expected = "fivehundred ninety eight";
		String actual = ite.translateEng(598);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void test100() {
		IntToEng ite = new IntToEng();
		String expected = "onehundred";
		String actual = ite.translateEng(100);
		assertThat(actual, is(expected));
	}
	@Test
	public void test310() {
		IntToEng ite = new IntToEng();
		String expected = "threehundred ten";
		String actual = ite.translateEng(310);
		assertThat(actual, is(expected));
	}
}
