package com.interview.solution.iterative;

import com.interview.common.IProblemSolver;
import com.interview.common.Tuple;
import com.interview.solution.base.AbstractCheckIfTwoStringsAreAnagramsTest;

public class CheckIfTwoStringsAreAnagramsIterativeTest extends AbstractCheckIfTwoStringsAreAnagramsTest {

	public CheckIfTwoStringsAreAnagramsIterativeTest(Tuple<String, String> strings, Boolean areAnagrams) {
		super(strings, areAnagrams);
	}

	@Override
	public IProblemSolver<Tuple<String, String>, Boolean> getProblemSolver() {
		return new CheckIfTwoStringsAreAnagramsIterative();
	}
}
