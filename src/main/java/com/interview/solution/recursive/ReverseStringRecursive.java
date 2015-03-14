package com.interview.solution.recursive;

import com.interview.common.IProblemSolver;

/**
 * Reverse a String recursively.
 */
public class ReverseStringRecursive implements IProblemSolver<String, String> {
	@Override
	public String solve(String input) {
		if (input.isEmpty()) {
			return input;
		}
		return solve(input.substring(1)) + input.charAt(0);
	}
}
