package com.interview.solution.iterative;

import com.interview.common.IProblemSolver;
import com.interview.solution.base.AbstractMostFrequentIntegerInArrayTest;

public class MostFrequentIntegerInArrayIterativeTest extends AbstractMostFrequentIntegerInArrayTest {
	@Override
	public IProblemSolver<Integer[], Integer> getProblemSolver() {
		return new MostFrequentIntegerInArrayIterative();
	}
}
