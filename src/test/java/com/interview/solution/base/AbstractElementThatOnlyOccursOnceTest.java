package com.interview.solution.base;

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
public abstract class AbstractElementThatOnlyOccursOnceTest implements ISolverTestCase<Object[], Object> {
	private Object[] input;
	private Object element;

	public AbstractElementThatOnlyOccursOnceTest(Object[] input, Object element) {
		this.input = input;
		this.element = element;
	}

	@Parameterized.Parameters
	public static Collection getParameters() {
		return Arrays.asList(new Object[][]{
						{new Object[]{"A", "A", "B", "C", "C"}, "B"},
						{new Object[]{0, 0, 1, 1, 1, 2, 3, 2, 3}, null},
						{new Object[]{true, false, false}, Boolean.TRUE},
						{new Object[0], null},
		});
	}

	@Test
	public void checkIfOnlyOccursOnce() {
		assertThat(getProblemSolver().solve(input), is(equalTo(element)));
	}
}
