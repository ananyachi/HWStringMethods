package practice;

import java.util.*;

public class AbcTest {

	public static void main(String[] args) {
		String test = "abc.123";
		System.out.println(abcTest(test));
	}

	public static boolean abcTest(String test) {

		int indexOfabc = test.indexOf("abc");
		if (indexOfabc - 1 != -1) {
			int checkIfDot = indexOfabc - 1;
			
			if ((test.substring(checkIfDot, checkIfDot + 1)).equals(".")) {
				return false;
			}
			return true;
		} else {
			return true;
		}
	}

}