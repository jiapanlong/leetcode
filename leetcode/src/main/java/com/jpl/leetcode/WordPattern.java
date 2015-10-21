package com.jpl.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WordPattern {

	public boolean wordPattern(String pattern, String str) {

		Map<Character, String> map = new HashMap<Character, String>();

		String[] strs = str.split(" ");

		if (pattern.length() != strs.length) {
			return false;
		}

		for (int i = 0; i < pattern.length(); i++) {

			char key = pattern.charAt(i);

			if (map.containsKey(key)) {
				String value = strs[i];
				if (!value.equals(map.get(key))) {
					return false;
				}
			} else if (map.containsValue(strs[i])) {
				return false;
			} else {
				map.put(key, strs[i]);
			}
		}

		return true;
	}

	public boolean wordPattern2(String pattern, String str) {
		if (pattern.isEmpty() || str.isEmpty()) {
			return false;
		}

		String[] s = str.split(" ");
		if (s.length != pattern.length()) {
			return false;
		}

		@SuppressWarnings("rawtypes")
		HashMap<Comparable, Integer> hashMap = new HashMap<Comparable, Integer>();
		for (int i = 0; i < pattern.length(); i++) {
			if (!Objects.equals(hashMap.put(pattern.charAt(i), i), hashMap.put(s[i], i))) {
				return false;
			}
		}

		return true;
	}
}
