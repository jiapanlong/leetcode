package com.jpl.leetcode;

public class SingleNumberII {
	public int singleNumber(int nums[]) {

		int[] count = new int[32];
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < 32; j++) {
				if ((nums[i] >> j & 1) == 1) {
					count[j]++;
				}
			}
		}

		for (int i = 0; i < 32; i++) {
			result += count[i] % 3 << i;
		}

		return result;
	}
}
