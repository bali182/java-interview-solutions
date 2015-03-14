package com.interview.solution.base;

import com.interview.common.Tuple;
import com.interview.common.Tuples;
import com.interview.solution.common.ISolverTestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public abstract class AbstractMultiplyWithoutOperatorTest implements ISolverTestCase<Tuple<Integer, Integer>, Integer> {
	private Tuple<Integer, Integer> values;
	private Integer result;

	public AbstractMultiplyWithoutOperatorTest(Tuple<Integer, Integer> values, Integer result) {
		this.values = values;
		this.result = result;
	}

	@Parameterized.Parameters
	public static Collection getParameters() {
		return Arrays.asList(new Object[][]{
						{Tuples.of(1, 1), 1},
						{Tuples.of(2, 3), 6},
						{Tuples.of(6, 8), 48},
						{Tuples.of(5, 5), 25},
						{Tuples.of(100, 4), 400},
						{Tuples.of(30, 5), 150},
		});
	}

	@Test
	public void checkIfAnagrams() {
		assertThat(getProblemSolver().solve(values), is(equalTo(result)));
	}
}
