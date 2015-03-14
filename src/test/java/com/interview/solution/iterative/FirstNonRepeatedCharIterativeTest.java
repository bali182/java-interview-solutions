package com.interview.solution.iterative;

import com.interview.common.IProblemSolver;
import com.interview.solution.base.AbstractFirstNonRepeatedCharTest;

public class FirstNonRepeatedCharIterativeTest extends AbstractFirstNonRepeatedCharTest {
	public FirstNonRepeatedCharIterativeTest(String input, Character result) {
		super(input, result);
	}

	@Override
	public IProblemSolver<String, Character> getProblemSolver() {
		return new FirstNonRepeatedCharIterative();
	}
}
