package com.interview.common;

/**
 * General interface for solving a problem.
 * @param <I> The input type
 * @param <O> The output type
 */
public interface IProblemSolver<I, O> {
	/**
	 * Solves the problem
	 * @param input The input of the problem
	 * @return The solution for the problem
	 */
	O solve(I input);
}
