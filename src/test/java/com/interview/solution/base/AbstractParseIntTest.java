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
public abstract class AbstractParseIntTest implements ISolverTestCase<String, Integer> {
	private String asString;
	private Integer asInteger;

	public AbstractParseIntTest(String asString, Integer asInteger) {
		this.asString = asString;
		this.asInteger = asInteger;
	}

	@Parameterized.Parameters
	public static Collection getParameters() {
		return Arrays.asList(new Object[][]{
						{"0", 0},
						{"2", 2},
						{"10", 10},
						{"124", 124},
						{"5023121", 5023121}
		});
	}

	@Test
	public void testConvert() {
		assertThat(getProblemSolver().solve(asString), is(equalTo(asInteger)));
	}
}
