package com.interview.solution.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public abstract class AbstractCheckIfPalindromeTest implements ISolverTestCase<String, Boolean> {
	private String theString;
	private Boolean isPalindrome;

	public AbstractCheckIfPalindromeTest(String theString, Boolean isUnique) {
		this.theString = theString;
		this.isPalindrome = isUnique;
	}

	@Parameterized.Parameters
	public static Collection getParameters() {
		return Arrays.asList(new Object[][]{
						{"A but tuba", true},
						{"A car a man a maraca", true},
						{"A lad named E Mandala", true},
						{"alma", false},
						{"A Santa at Nasa", true},
						{"this is not a palindrome", false}
		});
	}

	@Test
	public void isPalindrome() {
		assertThat(getProblemSolver().solve(theString), is(equalTo(isPalindrome)));
	}
}
