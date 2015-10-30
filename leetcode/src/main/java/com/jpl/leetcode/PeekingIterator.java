package com.jpl.leetcode;

import java.util.Iterator;

public class PeekingIterator implements Iterator<Integer> {

	private Integer peek;
	private Iterator<Integer> iterator;

	public PeekingIterator(Iterator<Integer> iterator) {
		this.iterator = iterator;
	}

	public Integer peek() {

		if (peek != null) {
			return peek;
		} else {
			peek = iterator.next();
		}
		return peek;
	}

	@Override
	public boolean hasNext() {
		if (peek != null) {
			return true;
		} else {
			return iterator.hasNext();
		}
	}

	@Override
	public Integer next() {
		if (peek != null) {
			int temp = peek;
			peek = null;
			return temp;
		}
		return iterator.next();
	}

}
