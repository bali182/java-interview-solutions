package com.interview.solution.functional;

import com.interview.common.IProblemSolver;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Check if a String is composed of all unique characters
 */
public class CheckIfStringHasUniqueCharsFunctional implements IProblemSolver<String, Boolean> {
	@Override
	public String getName() {
		return getClass().getSimpleName();
	}

	@Override
	public Boolean solve(String input) {
		return !input.chars()
						.boxed()
						.map(i -> Character.valueOf((char) i.intValue()))
						.collect(Collectors.toMap(c -> c, c -> 1, (a, b) -> a + b))
						.entrySet().stream().anyMatch(e -> e.getValue() > 1);
	}
}
