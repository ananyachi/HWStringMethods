package practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MergeStringsTest {

	@Test
	void testMergeStrings1() {
		String result = MergeStrings.join("Hi", "There");
		assertEquals( result, "HTihere");
	}
	@Test
	void testMergeStrings2() {
		String result = MergeStrings.join("xxxx", "Thereee");
		assertEquals( result, "xTxhxexreee");
	}
	@Test
	void testMergeStrings3() {
		String result = MergeStrings.join( "Thereee", "xxxx");
		assertEquals( result, "Txhxexrxeee");
	}
	@Test
	void testMergeStrings4() {
		String result = MergeStrings.join( "abc", "xyz");
		assertEquals( result, "axbycz");
	}

}
