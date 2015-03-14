package com.interview.solution.functional;

import com.interview.common.IProblemSolver;
import com.interview.solution.base.AbstractParseIntTest;

public class ParseIntFunctionalTest extends AbstractParseIntTest {
	public ParseIntFunctionalTest(String asString, Integer asInteger) {
		super(asString, asInteger);
	}
	@Override
	public IProblemSolver<String, Integer> getProblemSolver() {
		return new ParseIntFunctional();
	}
}
