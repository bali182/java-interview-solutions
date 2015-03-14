package com.interview.solution.functional;

import com.interview.common.IProblemSolver;
import com.interview.common.Tuple;
import com.interview.solution.base.AbstractMultiplyWithoutOperatorTest;

public class MultiplyWithoutOperatorFunctionalTest extends AbstractMultiplyWithoutOperatorTest {
	public MultiplyWithoutOperatorFunctionalTest(Tuple<Integer, Integer> values, Integer result) {
		super(values, result);
	}

	@Override
	public IProblemSolver<Tuple<Integer, Integer>, Integer> getProblemSolver() {
		return new MultiplyWithoutOperatorFunctional();
	}
}
