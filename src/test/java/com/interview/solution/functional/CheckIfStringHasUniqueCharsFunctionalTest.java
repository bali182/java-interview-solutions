package com.interview.solution.functional;

import com.interview.common.IProblemSolver;
import com.interview.solution.base.AbstractCheckIfStringHasUniqueCharsTest;

public class CheckIfStringHasUniqueCharsFunctionalTest extends AbstractCheckIfStringHasUniqueCharsTest {
	public CheckIfStringHasUniqueCharsFunctionalTest(String theString, Boolean isUnique) {
		super(theString, isUnique);
	}

	@Override
	public IProblemSolver<String, Boolean> getProblemSolver() {
		return new CheckIfStringHasUniqueCharsFunctional();
	}
}
