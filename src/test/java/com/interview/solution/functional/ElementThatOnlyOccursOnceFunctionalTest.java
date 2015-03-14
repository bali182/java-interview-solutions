package com.interview.solution.functional;

import com.interview.common.IProblemSolver;
import com.interview.solution.base.AbstractElementThatOnlyOccursOnceTest;

public class ElementThatOnlyOccursOnceFunctionalTest extends AbstractElementThatOnlyOccursOnceTest {
	public ElementThatOnlyOccursOnceFunctionalTest(Object[] input, Object element) {
		super(input, element);
	}

	@Override
	public IProblemSolver<Object[], Object> getProblemSolver() {
		return new ElementThatOnlyOccursOnceFunctional();
	}
}
