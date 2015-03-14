package com.interview.solution.base;

import com.interview.common.Tuple;
import com.interview.common.Tuples;
import com.interview.solution.common.ISolverTestCase;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public abstract class AbstractPairsWhoseSumIsTenTest implements ISolverTestCase<Integer[], Set<Tuple<Integer, Integer>>> {
	@Test
	public void emptyArrayInput() {
		assertThat(getProblemSolver().solve(new Integer[0]), is(equalTo(Collections.emptySet())));
	}

	@Test
	public void singleElementArrayInputWhosSumIsTen() {
		assertThat(getProblemSolver().solve(new Integer[]{5}), is(equalTo(new HashSet<>(Arrays.asList(Tuples.of(5, 5))))));
	}

	@Test
	public void singleElementArrayInputWhosSumIsNotTen() {
		assertThat(getProblemSolver().solve(new Integer[]{7}), is(equalTo(Collections.emptySet())));
	}

	@Test
	public void multiElementArrayInput() {
		assertThat(getProblemSolver().solve(
										new Integer[]{7, 3, 4, 5, 2}),
						is(equalTo(new HashSet<>(Arrays.asList(Tuples.of(5, 5), Tuples.of(3, 7), Tuples.of(7, 3)))))
		);
	}
}
