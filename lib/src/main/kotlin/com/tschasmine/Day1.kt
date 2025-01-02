package com.tschasmine

class Day1 {

    fun calculateTotalDistance(input: String): Int {
        val numberSets = parseInput(input)
        return numberSets.pair().sumOf { numberSet ->
            kotlin.math.abs(numberSet.first - numberSet.second)
        }
    }

    private fun parseInput(input: String): NumberSets {
        val pairs = input.trim().lines().map { line ->
            val (firstNo, _, secondNo) = Regex("(\\d+)(\\s+)(\\d+)").find(line.trim())?.destructured
                ?: throw IllegalArgumentException("Invalid input: $line")
            firstNo.toInt() to secondNo.toInt()
        }

        return NumberSets(pairs.map { it.first }.sorted(), pairs.map { it.second }.sorted())
    }

    fun calculateSimilarity(input: String): Int {
        val numberSets = parseInput(input)
        val occurrences = numberSets.secondNumberSet.groupingBy { it }.eachCount()
        return numberSets.firstNumberSet.sumOf { it * (occurrences[it] ?: 0) }
    }
}

data class NumberSets(val firstNumberSet: List<Int>, val secondNumberSet: List<Int>) {
    fun pair() = firstNumberSet.zip(secondNumberSet)
}
