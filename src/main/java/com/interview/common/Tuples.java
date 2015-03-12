package com.interview.common;

/**
 * Static factory for tuples.
 */
public class Tuples {
	/**
	 * Creates a tuple with 2 value
	 *
	 * @param first  The first value
	 * @param second The second value
	 * @param <A>    The type of the first value
	 * @param <B>    The type of the second value
	 * @return The created Tuple.
	 */
	public static <A, B> Tuple<A, B> of(A first, B second) {
		return new Tuple<>(first, second);
	}
}
