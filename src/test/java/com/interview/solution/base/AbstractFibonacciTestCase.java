package com.interview.solution.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public abstract class AbstractFibonacciTestCase implements ISolverTestCase<Long, Long> {
	private Long input;
	private Long result;

	public AbstractFibonacciTestCase(Long input, Long result) {
		this.input = input;
		this.result = result;
	}

	@Parameterized.Parameters
	public static Collection getParameters() {
		return Arrays.asList(new Object[][]{
						{0L, 0L},
						{1L, 1L},
						{3L, 2L},
						{14L, 377L},
						{20L, 6765L},
						{25L, 75025L},
						{28L, 317811L}
		});
	}

	@Test
	public void testFibonacci() {
		assertThat(getProblemSolver().solve(input), is(equalTo(result)));
	}
}
