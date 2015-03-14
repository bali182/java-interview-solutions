package com.interview.solution.common;

import com.interview.common.IProblemSolver;

/**
 * Interface for tests, that work with an IProblemSolver
 */
public interface ISolverTestCase<I, O> {
	/**
	 * @return The IProblemSolver instance, that can be used for the general solution
	 */
	IProblemSolver<I, O> getProblemSolver();
}
