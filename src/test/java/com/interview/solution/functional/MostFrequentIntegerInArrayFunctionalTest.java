package com.interview.solution.functional;

import com.interview.common.IProblemSolver;
import com.interview.solution.base.AbstractMostFrequentIntegerInArrayTest;

public class MostFrequentIntegerInArrayFunctionalTest extends AbstractMostFrequentIntegerInArrayTest {
	@Override
	public IProblemSolver<Integer[], Integer> getProblemSolver() {
		return new MostFrequentIntegerInArrayFunctional();
	}
}
