package com.interview.solution.functional;

import com.interview.common.IProblemSolver;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Find the only element in an array that only occurs once.
 */
public class ElementThatOnlyOccursOnceFunctional implements IProblemSolver<Object[], Object> {
	@Override
	public Object solve(Object[] input) {
		Optional<Map.Entry<Object, Integer>> onlyOnce = Arrays.asList(input)
						.stream()
						.collect(Collectors.toMap(e -> e, e -> 1, (v1, v2) -> v1 + v2))
						.entrySet()
						.stream()
						.filter(e -> e.getValue().intValue() == 1)
						.findFirst();
		return onlyOnce.isPresent() ? onlyOnce.get().getKey() : null;
	}
}
