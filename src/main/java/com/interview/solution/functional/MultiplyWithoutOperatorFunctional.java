package com.interview.solution.functional;

import com.interview.common.IProblemSolver;
import com.interview.common.Tuple;

import java.util.stream.IntStream;

/**
 * Implement an exponent function (bonus: now try in log(n) time)
 */
public class MultiplyWithoutOperatorFunctional implements IProblemSolver<Tuple<Integer, Integer>, Integer> {
	@Override
	public Integer solve(final Tuple<Integer, Integer> input) {
		return IntStream
						.generate(() -> input.getFirst().intValue())
						.limit(input.getSecond().intValue())
						.reduce(0, (a, b) -> a + b);
	}
}
