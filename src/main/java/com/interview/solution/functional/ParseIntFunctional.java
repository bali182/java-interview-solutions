package com.interview.solution.functional;

import com.interview.common.IProblemSolver;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Implement parseInt
 */
public class ParseIntFunctional implements IProblemSolver<String, Integer> {
	@Override
	public String getName() {
		return getClass().getSimpleName();
	}

	@Override
	public Integer solve(String input) {
		final AtomicInteger decimalPlace = new AtomicInteger(input.length() - 1);
		return input
						.chars()
						.map(c -> Character.digit(c, 10))
						.reduce(0, (a, n) -> a + (n * (int) Math.pow(10, decimalPlace.getAndDecrement())));
	}
}
