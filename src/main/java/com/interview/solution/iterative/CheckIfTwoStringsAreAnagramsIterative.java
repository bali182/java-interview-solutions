package com.interview.solution.iterative;

import com.interview.common.IProblemSolver;
import com.interview.common.Tuple;

import java.util.HashMap;
import java.util.Map;

/**
 * Determine if 2 Strings are anagrams.
 */
public class CheckIfTwoStringsAreAnagramsIterative implements IProblemSolver<Tuple<String, String>, Boolean> {
	@Override
	public Boolean solve(Tuple<String, String> input) {
		Map<Character, Integer> chars = new HashMap<>();
		String first = input.getFirst().toLowerCase().replaceAll("\\s+", "");
		String second = input.getSecond().toLowerCase().replaceAll("\\s+","");

		// Map the characters in the first String to its multiplicity
		for (Character c : first.toCharArray()) {
			int previousCount = chars.containsKey(c) ? chars.get(c).intValue() : 0;
			chars.put(c, Integer.valueOf(previousCount + 1));
		}
		// Iterate the second String and decrease the multiplicity of the characters.
		for (Character c : second.toCharArray()) {
			Integer count = chars.get(c);
			// If the map didn't contain c, then we don't work anymore
			if (count == null) {
				return Boolean.FALSE;
			}
			int newCount = count.intValue() - 1;
			if (newCount == 0) {
				// If there is no more of this character in the other String, we remove it from the map
				chars.remove(c);
			} else {
				// Otherwise we decrement the amount
				chars.put(c, Integer.valueOf(newCount));
			}
		}
		// If the map was empty, we got an anagram
		return Boolean.valueOf(chars.isEmpty());
	}
}
