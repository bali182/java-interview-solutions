package com.interview.solution.iterative;

import com.interview.solution.functional.MostFrequentIntegerInArrayFunctional;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MostFrequentIntegerInArrayIterativeTest {
	@Test
	public void emptyArrayInput() {
		MostFrequentIntegerInArrayIterative solver = new MostFrequentIntegerInArrayIterative();
		assertThat(solver.solve(new Integer[0]), is(equalTo(null)));
	}

	@Test
	public void singleElementArrayInput() {
		MostFrequentIntegerInArrayIterative solver = new MostFrequentIntegerInArrayIterative();
		assertThat(solver.solve(new Integer[]{5}), is(equalTo(5)));
	}

	@Test
	public void nonEmptyArrayInput() {
		MostFrequentIntegerInArrayIterative solver = new MostFrequentIntegerInArrayIterative();
		assertThat(solver.solve(new Integer[]{2, 1, 1, 1, 2, 2, 1, 3, 4, 5, 5, 5, 1}), is(equalTo(1)));
	}
}
