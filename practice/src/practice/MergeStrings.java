package practice;

import java.util.ArrayList;

public class MergeStrings {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "xyz";
		System.out.println(join(str1, str2));
		str1 = "Hi";
		str2 = "There";
		System.out.println(join(str1, str2));
		str1 = "xxxx";
		str2 = "Thereee";
		System.out.println(join(str1, str2));
		str2 = "xxxx";
		str1 = "Thereee";
		System.out.println(join(str1, str2));
	}

	public static String join(String str1, String str2) {
		int str1Index = 0;
		int str2Index = 0;
		int str1Size = str1.length();
		int str2Size = str2.length();
		int mergedStrIndex = 0;
		char[] str1CharArr = str1.toCharArray();
		char[] str2CharArr = str2.toCharArray();

		char[] mergedStr = new char[str1Size + str2Size];
		while (str1Index < str1Size && str2Index < str2Size) {
			mergedStr[mergedStrIndex++] = str1CharArr[str1Index++];
			mergedStr[mergedStrIndex++] = str2CharArr[str2Index++];

		}
		if (str1Index < str1Size) {
			while (str1Index < str1Size) {
				mergedStr[mergedStrIndex++] = str1CharArr[str1Index++];
			}

		}
		if (str2Index < str2Size) {
			while (str2Index < str2Size) {
				mergedStr[mergedStrIndex++] = str2CharArr[str2Index++];
			}
		}
		return String.copyValueOf(mergedStr);
	}
}