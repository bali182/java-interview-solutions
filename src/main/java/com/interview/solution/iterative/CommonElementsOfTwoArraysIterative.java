package com.interview.solution.iterative;

import com.interview.common.IProblemSolver;
import com.interview.common.Tuple;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Find the common elements of 2 int arrays
 */
public class CommonElementsOfTwoArraysIterative implements IProblemSolver<Tuple<Integer[], Integer[]>, Iterable<Integer>> {

	private static void removeIfNotContains(Set<Integer> allElements, Integer[] elements) {
		for (Integer i : elements) {
			if (!allElements.contains(i)) {
				allElements.remove(i);
			}
		}
	}
	@Override
	public String getName() {
		return getClass().getSimpleName();
	}

	@Override
	public Iterable<Integer> solve(Tuple<Integer[], Integer[]> input) {
		Set<Integer> allElements = new HashSet<>(Arrays.asList(input.getFirst()));
		allElements.addAll(Arrays.asList(input.getSecond()));
		removeIfNotContains(allElements, input.getFirst());
		removeIfNotContains(allElements, input.getSecond());
		return allElements;
	}
}
