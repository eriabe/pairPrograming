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
		String expected = "fivehundred and ninety eight";
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
		String expected = "threehundred and ten";
		String actual = ite.translateEng(310);
		assertThat(actual, is(expected));
	}
	@Test
	public void test1234() {
		IntToEng ite = new IntToEng();
		String expected = "onethousand twohundred and thirty four";
		String actual = ite.translateEng(1234);
		assertThat(actual, is(expected));
	}
	@Test
	public void test1001() {
		IntToEng ite = new IntToEng();
		String expected = "onethousand one";
		String actual = ite.translateEng(1001);
		assertThat(actual, is(expected));
	}
}
