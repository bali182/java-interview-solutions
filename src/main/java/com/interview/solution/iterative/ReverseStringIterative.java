package com.interview.solution.iterative;

import com.interview.common.IProblemSolver;

/**
 * Reverse a String iteratively .
 */
public class ReverseStringIterative implements IProblemSolver<String, String> {
	@Override
	public String solve(String input) {
		if (input.isEmpty()) {
			return input;
		}
		// We could do it by new StringBuilder(input).reverse().toString(), but whatever
		StringBuilder reversed = new StringBuilder();
		for (int i = input.length() - 1; i >= 0; i--) {
			reversed.append(input.charAt(i));
		}
		return reversed.toString();
	}
}
