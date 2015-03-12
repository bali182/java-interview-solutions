package com.interview.solution.functional;

import com.interview.common.Tuples;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class PairsWhoseSumIsTenFunctionalTest {
	@Test
	public void emptyArrayInput() {
		PairsWhoseSumIsTenFunctional solver = new PairsWhoseSumIsTenFunctional();
		assertThat(solver.solve(new Integer[0]), is(equalTo(Collections.emptySet())));
	}

	@Test
	public void singleElementArrayInputWhosSumIsTen() {
		PairsWhoseSumIsTenFunctional solver = new PairsWhoseSumIsTenFunctional();
		assertThat(solver.solve(new Integer[]{5}), is(equalTo(new HashSet<>(Arrays.asList(Tuples.of(5, 5))))));
	}

	@Test
	public void singleElementArrayInputWhosSumIsNotTen() {
		PairsWhoseSumIsTenFunctional solver = new PairsWhoseSumIsTenFunctional();
		assertThat(solver.solve(new Integer[]{7}), is(equalTo(Collections.emptySet())));
	}

	@Test
	public void multiElementArrayInput() {
		PairsWhoseSumIsTenFunctional solver = new PairsWhoseSumIsTenFunctional();
		assertThat(solver.solve(
						new Integer[]{7, 3, 4, 5, 2}),
						is(equalTo(new HashSet<>(Arrays.asList(Tuples.of(5, 5), Tuples.of(3, 7), Tuples.of(7, 3)))))
		);
	}
}
