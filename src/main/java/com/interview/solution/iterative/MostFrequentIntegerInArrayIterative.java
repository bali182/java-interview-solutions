package com.interview.solution.iterative;

import com.interview.common.IProblemSolver;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Iterative-style solution for:
 * Find the most frequent integer in an array
 */
public class MostFrequentIntegerInArrayIterative implements IProblemSolver<Integer[], Integer> {
	@Override
	public Integer solve(Integer[] input) {
		// We assume that input is not null
		Map<Integer, Integer> valueToCountMapping = new HashMap<>();
		for (Integer i : input) {
			Integer oldValue = valueToCountMapping.containsKey(i) ? valueToCountMapping.get(i) : 0;
			valueToCountMapping.put(i, oldValue + 1);
		}
		// This could also be done by Collections#max or some with the stream api
		Map.Entry<Integer, Integer> maxEntry = null;
		for (Map.Entry<Integer, Integer> e : valueToCountMapping.entrySet()) {
			if (maxEntry == null || e.getValue() > maxEntry.getValue()) {
				maxEntry = e;
			}
		}
		return maxEntry == null ? null : maxEntry.getKey();
	}
}
