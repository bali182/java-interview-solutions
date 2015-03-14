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
public abstract class AbstractReverseStringTest implements ISolverTestCase<String, String> {

		private String input;
		private String reverse;

		public AbstractReverseStringTest(String input, String reverse) {
			this.input = input;
			this.reverse = reverse;
		}

		@Parameterized.Parameters
		public static Collection getParameters() {
			return Arrays.asList(new Object[][]{
							{"", ""},
							{"Test", "tseT"},
							{"My name is Balazs", "szalaB si eman yM"},
							{"This test should work perfectly with longer Strings too", "oot sgnirtS regnol htiw yltcefrep krow dluohs tset sihT"},
			});
		}

		@Test
		public void checkReverse() {
			assertThat(getProblemSolver().solve(input).toString(), is(equalTo(reverse)));
		}
}
