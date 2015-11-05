package com.jpl.leetcode;

public class MissingNumber {

	public int missingNumber(int[] nums) {

		int sum = 0;
		int n = nums.length;
		for (int i : nums) {
			sum += i;
		}
		return (int) (0.5 * n * (n + 1) - sum);
	}

	public int missingNumber2(int[] nums) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			result ^= nums[i] ^ (i + 1);
		}
		return result;
	}

}
