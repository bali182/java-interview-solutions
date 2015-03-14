package com.interview.solution.functional;

import com.interview.common.IProblemSolver;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Find the only element in an array that only occurs once.
 */
public class ElementThatOnlyOccursOnce implements IProblemSolver<Integer[], Integer> {
	@Override
	public String getName() {
		return getClass().getSimpleName();
	}

	@Override
	public Integer solve(Integer[] input) {
		Optional<Map.Entry<Integer, Integer>> onlyOnce = Arrays.asList(input)
						.stream()
						.collect(Collectors.toMap(e -> e, e -> 1, (v1, v2) -> v1 + v2))
						.entrySet()
						.stream()
						.filter(e -> e.getValue().intValue() == 1)
						.findFirst();
		return onlyOnce.isPresent() ? onlyOnce.get().getKey() : null;
	}
}
