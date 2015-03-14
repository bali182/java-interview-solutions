package com.interview.solution.base;

import com.interview.common.Tuple;
import com.interview.common.Tuples;
import com.interview.solution.common.ISolverTestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public abstract class AbstractCommonElementsOfTwoArraysTest implements ISolverTestCase<Tuple<Integer[], Integer[]>, Set<Integer>> {
	private Tuple<Integer[], Integer[]> inputs;
	private Set<Integer> commonElements;

	public AbstractCommonElementsOfTwoArraysTest(Tuple<Integer[], Integer[]> inputs, Set<Integer> commonElements) {
		this.inputs = inputs;
		this.commonElements = commonElements;
	}

	@Parameterized.Parameters
	public static Collection getParameters() {
		return Arrays.asList(new Object[][]{
						{Tuples.of(new Integer[]{1, 2, 3, 4}, new Integer[]{4, 5, 6, 7}), new HashSet<>(Arrays.asList(4))},
						{Tuples.of(new Integer[]{1, 2, 3, 4}, new Integer[]{3, 4, 8}), new HashSet<>(Arrays.asList(3, 4))},
						{Tuples.of(new Integer[]{1, 2, 3, 4}, new Integer[]{3, 8, 1}), new HashSet<>(Arrays.asList(1, 3))},
						{Tuples.of(new Integer[]{1, 2, 3, 4}, new Integer[]{7, 8, 9, 10}), Collections.emptySet()},
		});
	}

	@Test
	public void ceckElements() {
		assertThat(getProblemSolver().solve(inputs), is(equalTo(commonElements)));
	}
}
