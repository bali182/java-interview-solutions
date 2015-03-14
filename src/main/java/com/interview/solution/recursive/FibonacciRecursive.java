package com.interview.solution.recursive;

import com.interview.common.IProblemSolver;

/**
 * Write fibbonaci recursively
 */
public class FibonacciRecursive implements IProblemSolver<Long, Long> {
	@Override
	public Long solve(Long input) {
		if (input == 0) {
			return 0L;
		} else if (input == 1) {
			return 1L;
		}
		return solve(input - 1) + solve(input - 2);
	}
}
