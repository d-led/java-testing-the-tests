/*
 * SPDX-FileCopyrightText: © 2024 Siemens AG
 * SPDX-License-Identifier: Unlicense
 */

package com.siemens.code.dled;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class MathsTest {
    Maths maths = new Maths();
    @Test void summation() {
        // how hard can 2+2 be?
        assertThat(maths.sumOf(2, 2))
            .isEqualTo(4)
            // .isGreaterThanOrEqualTo(0)
            ;

        // uncomment this assertion to pass the mutation test
        // assertThat(maths.sumOf(2, 4))
        //     .isEqualTo(6)
        // ;
    }
}
