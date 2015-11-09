package com.jpl.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SingleNumberIII {

	public int[] singleNumberIII(int[] nums) {

		int[] result = { 0, 0 };

		int n = 0;
		for (int num : nums) {
			n ^= num;
		}

		n = n & (~(n - 1));

		for (int elem : nums) {

			if ((elem & n) != 0) {
				result[0] = result[0] ^ elem;
			} else {
				result[1] = result[1] ^ elem;
			}
		}

		return result;
	}
}
