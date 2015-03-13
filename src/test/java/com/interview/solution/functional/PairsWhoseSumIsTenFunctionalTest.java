package com.interview.solution.functional;

import com.interview.common.IProblemSolver;
import com.interview.common.Tuple;
import com.interview.solution.base.AbstractPairsWhoseSumIsTenTest;

import java.util.Set;

public class PairsWhoseSumIsTenFunctionalTest extends AbstractPairsWhoseSumIsTenTest {
	@Override
	public IProblemSolver<Integer[], Set<Tuple<Integer, Integer>>> getProblemSolver() {
		return new PairsWhoseSumIsTenFunctional();
	}
}
