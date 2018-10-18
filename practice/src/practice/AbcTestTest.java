package practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AbcTestTest {


	@Test
	void testAbcTest1() {
		boolean result = AbcTest.abcTest("123abc");
		assertEquals(true, result);
	}
	
	@Test
	void testAbcTest2() {
		boolean result = AbcTest.abcTest("123.abc");
		assertEquals(false, result);
	}
	@Test
	void testAbcTest3() {
		boolean result = AbcTest.abcTest("abc.123");
		assertEquals(true, result);
	}

}
