package com.interview.solution.functional;

import com.interview.common.IProblemSolver;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Functional-style solution for:
 * Find the most frequent integer in an array
 */
public class MostFrequentIntegerInArrayFunctional implements IProblemSolver<Integer[], Integer> {
	@Override
	public String getName() {
		return getClass().getSimpleName();
	}

	@Override
	public Integer solve(Integer[] input) {
		// We assume that input is not null
		List<Integer> asList = Arrays.asList(input);
		Optional<Map.Entry<Integer, Integer>> maxValue = asList
						.stream()
						.collect(Collectors.toMap(e -> e, e -> 1, (a, b) -> a + b))
						.entrySet()
						.stream()
						.max((a, b) -> a.getValue().compareTo(b.getValue()));

		return maxValue.isPresent() ? maxValue.get().getKey() : null;
	}
}
