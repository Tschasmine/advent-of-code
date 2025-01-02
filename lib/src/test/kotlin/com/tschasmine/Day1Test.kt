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

    @Test
    fun `can calculate total distance of the actual input`() {
        val input = Day1Test::class.java.getResource("/day1/input.txt")!!.readText()
        assertThat(Day1().calculateTotalDistance(input), `is`(1879048))
    }

    @Test
    fun `can calculate the similarity of given example`() {
        val input = """
            3   4
            4   3
            2   5
            1   3
            3   9
            3   3
        """.trimIndent()

        assertThat(Day1().calculateSimilarity(input), `is`(31))
    }

    @Test
    fun `can calculate similarity of the actual input`() {
        val input = Day1Test::class.java.getResource("/day1/input.txt")!!.readText()
        assertThat(Day1().calculateSimilarity(input), `is`(21024792))
    }
}
