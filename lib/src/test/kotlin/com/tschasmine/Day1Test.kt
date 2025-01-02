package com.tschasmine;

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertTrue

class Day1Test {
    @Test
    fun `can calculate total distance of given example`() {
        val input = """
            3   4
            4   3
            2   5
            1   3
            3   9
            3   3
        """.trimIndent()

        assertThat(Day1().calculateTotalDistance(input), `is`(11))
    }
}
