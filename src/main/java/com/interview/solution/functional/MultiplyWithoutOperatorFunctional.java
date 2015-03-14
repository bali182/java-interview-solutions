package com.interview.solution.functional;

import com.interview.common.IProblemSolver;
import com.interview.common.Tuple;

import java.util.Collections;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Implement an exponent function (bonus: now try in log(n) time)
 */
public class MultiplyWithoutOperatorFunctional implements IProblemSolver<Tuple<Integer, Integer>, Integer> {
	@Override
	public Integer solve(final Tuple<Integer, Integer> input) {
		return Collections
						.nCopies(Math.min(input.getFirst(), input.getSecond()), Math.max(input.getFirst(), input.getSecond()))
						.stream()
						.reduce(0, (a, b) -> a + b);
	}
}
