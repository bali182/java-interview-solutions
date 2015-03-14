package com.interview.solution.iterative;

import com.interview.common.IProblemSolver;
import com.interview.solution.base.AbstractCheckIfPalindromeTest;

public class CheckIfPalindromeIterativeTest extends AbstractCheckIfPalindromeTest {
	public CheckIfPalindromeIterativeTest(String theString, Boolean isUnique) {
		super(theString, isUnique);
	}

	@Override
	public IProblemSolver<String, Boolean> getProblemSolver() {
		return new CheckIfPalindromeIterative();
	}
}
