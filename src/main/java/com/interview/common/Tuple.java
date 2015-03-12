package com.interview.common;

import javax.annotation.Generated;

/**
 * General tuple class for storing 2 values
 *
 * @param <A> The type of the first value
 * @param <B> The type of the second value
 */
public class Tuple<A, B> {
	private final A first;
	private final B second;

	/**
	 * Constructs a tuple
	 *
	 * @param first  The first value
	 * @param second The second value
	 */
	public Tuple(A first, B second) {
		this.first = first;
		this.second = second;
	}

	/**
	 * Returns the first value
	 *
	 * @return the first value
	 */
	public B getSecond() {
		return second;
	}

	/**
	 * Returns the second value
	 *
	 * @return the second value
	 */
	public A getFirst() {
		return first;
	}

	/** Generated by eclipse */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tuple other = (Tuple) obj;
		if (first == null) {
			if (other.first != null)
				return false;
		} else if (!first.equals(other.first))
			return false;
		if (second == null) {
			if (other.second != null)
				return false;
		} else if (!second.equals(other.second))
			return false;
		return true;
	}

	/** Generated by eclipse */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((first == null) ? 0 : first.hashCode());
		result = prime * result + ((second == null) ? 0 : second.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return new StringBuilder()
						.append('(')
						.append(getFirst())
						.append(',')
						.append(getSecond())
						.append(')')
						.toString();
	}
}
