package com.interview.solution.iterative;

import com.interview.common.IProblemSolver;

import java.util.Objects;

/**
 * Check if String is a palindrome
 */
public class CheckIfPalindromeIterative implements IProblemSolver<String, Boolean> {
	@Override
	public Boolean solve(String input) {
		String clean = input.toLowerCase().replaceAll("\\W", "");
		String reverse = new StringBuilder(clean).reverse().toString();
		return Objects.equals(clean, reverse);
	}
}
