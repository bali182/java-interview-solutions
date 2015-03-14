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
public abstract class AbstractFirstNonRepeatedCharTest implements ISolverTestCase<String, Character> {
	private String input;
	private Character result;

	public AbstractFirstNonRepeatedCharTest(String input, Character result) {
		this.input = input;
		this.result = result;
	}

	@Parameterized.Parameters
	public static Collection getParameters() {
		return Arrays.asList(new Object[][]{
						{"apple", 'a'},
						{"bob", 'o'},
						{"search in sorted list", 'a'},
		});
	}

	@Test
	public void checkFirstChar() {
		assertThat(getProblemSolver().solve(input), is(equalTo(result)));
	}
}
