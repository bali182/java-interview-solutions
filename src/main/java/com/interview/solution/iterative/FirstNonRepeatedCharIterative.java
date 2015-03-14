package com.interview.solution.iterative;

import com.interview.common.IProblemSolver;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Find the first non-repeated character in a String
 */
public class FirstNonRepeatedCharIterative implements IProblemSolver<String, Character> {
	@Override
	public Character solve(String input) {
		Map<Character, Integer> characterCount = new LinkedHashMap<>();
		for (Character c : input.toCharArray()) {
			int prevCount = characterCount.containsKey(c) ? characterCount.get(c) : 0;
			characterCount.put(c, prevCount + 1);
		}
		for (Map.Entry<Character, Integer> e : characterCount.entrySet()) {
			if (e.getValue().intValue() == 1) {
				return e.getKey();
			}
		}
		return null;
	}
}
