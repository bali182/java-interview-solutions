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
public abstract class AbstractCheckIfTwoStringsAreAnagramsTest implements ISolverTestCase<Tuple<String, String>, Boolean> {
	private Tuple<String, String> strings;
	private Boolean areAnagrams;

	public AbstractCheckIfTwoStringsAreAnagramsTest(Tuple<String, String> strings, Boolean areAnagrams) {
		this.strings = strings;
		this.areAnagrams = areAnagrams;
	}

	@Parameterized.Parameters
	public static Collection getParameters() {
		return Arrays.asList(new Object[][]{
						{Tuples.of("cat", "act"), Boolean.TRUE},
						{Tuples.of("doge", "cate"), Boolean.FALSE},
						{Tuples.of("doge", "dog"), Boolean.FALSE},
						{Tuples.of("Debit card", "Bad credit"), Boolean.TRUE},
						{Tuples.of("Astronomer", "Moon starer"), Boolean.TRUE},
						{Tuples.of("Conversation", "Voices rant on"), Boolean.TRUE},
						{Tuples.of("The Hurricanes", "These churn air"), Boolean.TRUE},
		});
	}

	@Test
	public void checkIfAnagrams() {
		assertThat(getProblemSolver().solve(strings), is(equalTo(areAnagrams)));
	}
}
