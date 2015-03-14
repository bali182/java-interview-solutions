package com.interview.solution.recursive;

import com.interview.common.IProblemSolver;
import com.interview.solution.base.AbstractReverseStringTest;

public class ReverseStringRecursiveTest extends AbstractReverseStringTest {
	public ReverseStringRecursiveTest(String input, String reverse) {
		super(input, reverse);
	}

	@Override
	public IProblemSolver<String, String> getProblemSolver() {
		return new ReverseStringRecursive();
	}
}
