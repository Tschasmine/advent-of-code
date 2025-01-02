package com.tschasmine

class Day1 {

    fun calculateTotalDistance(input: String): Int {
        val numberSets = parseInput(input)
        return numberSets.pair().sumOf { numberSet ->
            kotlin.math.abs(numberSet.first - numberSet.second)
        }
    }

    private fun parseInput(input: String): NumberSets {
        val pairs = input.lines().map { line ->
            val (firstNo, _, secondNo) = Regex("(\\d+)(\\s+)(\\d+)").find(line.trim())?.destructured
                ?: throw IllegalArgumentException("Invalid input")
            firstNo.toInt() to secondNo.toInt()
        }

        return NumberSets(pairs.map { it.first }.sorted(), pairs.map { it.second }.sorted())
    }
}

data class NumberSets(val firstNumberSet: List<Int>, val secondNumberSet: List<Int>) {
    fun pair() = firstNumberSet.zip(secondNumberSet)
}
