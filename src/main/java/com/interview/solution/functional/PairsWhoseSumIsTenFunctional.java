package com.interview.solution.functional;

import com.interview.common.IProblemSolver;
import com.interview.common.Tuple;
import com.interview.common.Tuples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Functional-style solution for:
 * Find pairs in an integer array whose sum is equal to 10 (bonus: do it in linear time)
 * <p>
 * This will not be linear time, so no bonus points for you
 */
public class PairsWhoseSumIsTenFunctional implements IProblemSolver<Integer[], Set<Tuple<Integer, Integer>>> {
	@Override
	public Set<Tuple<Integer, Integer>> solve(Integer[] input) {
		List<Integer> asList = Arrays.asList(input);
		Set<Tuple<Integer, Integer>> result = new HashSet<>();
		asList.stream()
						.map(i -> asList.stream()
										.map(j -> Tuples.of(i, j))
										.filter(t -> t.getFirst() + t.getSecond() == 10))
						.forEach(e -> result.addAll(e.collect(Collectors.toList())));
		return result;
	}
}
