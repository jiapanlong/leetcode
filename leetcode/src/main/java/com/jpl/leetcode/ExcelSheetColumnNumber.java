package com.jpl.leetcode;

public class ExcelSheetColumnNumber {

	public int titleToNumber(String s) {

		if (s == null || s.length() == 0) {
			throw new IllegalArgumentException("Input error");
		}

		int result = 0;

		int ind = s.length() - 1;
		int t = 0;

		while (ind >= 0) {
			char curr = s.charAt(ind);
			result += Math.pow(26, t) * (curr - 'A' + 1);
			t++;
			ind--;
		}

		return result;
	}

}
