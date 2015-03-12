package com.interview.solution.functional;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class MostFrequentIntegerInArrayFunctionalTest {
	@Test
	public void emptyArrayInput() {
		MostFrequentIntegerInArrayFunctional solver = new MostFrequentIntegerInArrayFunctional();
		assertThat(solver.solve(new Integer[0]), is(equalTo(null)));
	}

	@Test
	public void singleElementArrayInput() {
		MostFrequentIntegerInArrayFunctional solver = new MostFrequentIntegerInArrayFunctional();
		assertThat(solver.solve(new Integer[]{5}), is(equalTo(5)));
	}

	@Test
	public void nonEmptyArrayInput() {
		MostFrequentIntegerInArrayFunctional solver = new MostFrequentIntegerInArrayFunctional();
		assertThat(solver.solve(new Integer[]{2, 1, 1, 1, 2, 2, 1, 3, 4, 5, 5, 5, 1}), is(equalTo(1)));
	}
}
