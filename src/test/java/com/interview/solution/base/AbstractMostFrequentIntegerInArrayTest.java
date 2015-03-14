package com.interview.solution.base;

import com.interview.solution.common.ISolverTestCase;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public abstract class AbstractMostFrequentIntegerInArrayTest implements ISolverTestCase<Integer[], Integer> {
	@Test
	public void emptyArrayInput() {
		assertThat(getProblemSolver().solve(new Integer[0]), is(equalTo(null)));
	}

	@Test
	public void singleElementArrayInput() {
		assertThat(getProblemSolver().solve(new Integer[]{5}), is(equalTo(5)));
	}

	@Test
	public void nonEmptyArrayInput() {
		assertThat(getProblemSolver().solve(new Integer[]{2, 1, 1, 1, 2, 2, 1, 3, 4, 5, 5, 5, 1}), is(equalTo(1)));
	}
}
