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
public abstract class AbstractCheckIfStringHasUniqueCharsTest implements ISolverTestCase<String, Boolean> {
	private String theString;
	private Boolean isUnique;

	public AbstractCheckIfStringHasUniqueCharsTest(String theString, Boolean isUnique) {
		this.theString = theString;
		this.isUnique = isUnique;
	}

	@Parameterized.Parameters
	public static Collection getParameters() {
		return Arrays.asList(new Object[][]{
						{"0", true},
						{"abcdefgh", true},
						{"abcdefgha", false},
						{"aaaaaa", false},
						{"abababcd01", false},
						{"0123456789", true},
						{"0123456789abcd0", false}
		});
	}

	@Test
	public void isUnique() {
		assertThat(getProblemSolver().solve(theString), is(equalTo(isUnique)));
	}
}
