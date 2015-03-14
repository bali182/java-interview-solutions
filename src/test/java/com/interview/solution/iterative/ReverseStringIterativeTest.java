package com.interview.solution.iterative;

import com.interview.common.IProblemSolver;
import com.interview.solution.base.AbstractReverseStringTest;

public class ReverseStringIterativeTest extends AbstractReverseStringTest {
	public ReverseStringIterativeTest(String input, String reverse) {
		super(input, reverse);
	}

	@Override
	public IProblemSolver<String, String> getProblemSolver() {
		return new ReverseStringIterative();
	}
}
