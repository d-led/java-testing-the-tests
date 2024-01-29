/*
 * SPDX-FileCopyrightText: © 2024 Siemens AG
 * SPDX-License-Identifier: Unlicense
 */

package com.siemens.code.dled;

import net.jqwik.api.*;


public class MathsProperties {
    Maths maths = new Maths();

    @Property
	boolean hypothesis_sum_of_two_positive_numbers_is_positive(
		@ForAll("positive") int a,
		@ForAll("positive") int b
	) {
		return maths.sumOf(a, b) > 0;
	}

	@Provide
	Arbitrary<Integer> positive() {
		return Arbitraries.integers().filter(i -> i > 0);
	}
}
