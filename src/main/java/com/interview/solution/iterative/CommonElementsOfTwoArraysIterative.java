package com.interview.solution.iterative;

import com.interview.common.IProblemSolver;
import com.interview.common.Tuple;

import java.util.*;

/**
 * Find the common elements of 2 int arrays
 */
public class CommonElementsOfTwoArraysIterative implements IProblemSolver<Tuple<Integer[], Integer[]>, Set<Integer>> {

	private static void removeIfNotContains(Collection<Integer> commonElements, Collection<Integer> elements) {
		// create a copy of the original commonElements, so no remove-while-iterating is done
		for (Integer i : new HashSet<>(commonElements)) {
			// if the elements collection doesn't contain the element, that commonElements contains, we should remove it
			if (!elements.contains(i)) {
				commonElements.remove(i);
			}
		}
	}

	@Override
	public Set<Integer> solve(Tuple<Integer[], Integer[]> input) {
		Set<Integer> a = new HashSet<>(Arrays.asList(input.getFirst()));
		Set<Integer> b = new HashSet<>(Arrays.asList(input.getSecond()));

		Set<Integer> allElements = new HashSet<>(a);
		allElements.addAll(b);
		removeIfNotContains(allElements, a);
		removeIfNotContains(allElements, b);
		return allElements;
	}
}
