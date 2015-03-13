package com.interview.solution.base;

import com.interview.common.IProblemSolver;

/**
 * Interface for tests, that work with an IProblemSolver
 */
public interface ISolverTestCase<I, O> {
	IProblemSolver<I, O> getProblemSolver();
}
