package com.interview.solution.recursive;

import com.interview.common.IProblemSolver;
import com.interview.solution.base.AbstractFibonacciTestCase;

public class FibonacciRecursiveTest extends AbstractFibonacciTestCase {
	public FibonacciRecursiveTest(Long input, Long result) {
		super(input, result);
	}

	@Override
	public IProblemSolver<Long, Long> getProblemSolver() {
		return new FibonacciRecursive();
	}
}
