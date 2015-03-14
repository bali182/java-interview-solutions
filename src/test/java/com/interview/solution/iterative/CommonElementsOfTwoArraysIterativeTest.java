package com.interview.solution.iterative;

import com.interview.common.IProblemSolver;
import com.interview.common.Tuple;
import com.interview.solution.base.AbstractCommonElementsOfTwoArraysTest;

import java.util.Set;

public class CommonElementsOfTwoArraysIterativeTest extends AbstractCommonElementsOfTwoArraysTest {

	public CommonElementsOfTwoArraysIterativeTest(Tuple<Integer[], Integer[]> inputs, Set<Integer> commonElements) {
		super(inputs, commonElements);
	}

	@Override
	public IProblemSolver<Tuple<Integer[], Integer[]>, Set<Integer>> getProblemSolver() {
		return new CommonElementsOfTwoArraysIterative();
	}
}
