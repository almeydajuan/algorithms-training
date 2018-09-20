package com.juanalmeyda.training

import java.lang.RuntimeException

// https://www.hackerrank.com/challenges/between-two-sets
fun main(args: Array<String>) {
    println(getTotalX(arrayOf(2,4), arrayOf(16,32,96)))
}

fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
    val candidate = a.max() ?: throw RuntimeException()
    val max = b.min() ?: throw RuntimeException()
    return getTotalNumbers(candidate, candidate, max, 0, a, b)
}

fun getTotalNumbers(candidate: Int, increase: Int, max: Int, total: Int, a: Array<Int>, b: Array<Int>) : Int {
    if(candidate > max) return total
    if (areAllFactors(candidate, a) && isFactorOfAll(candidate, b))
        return getTotalNumbers(candidate + increase, increase, max, total + 1, a, b)
    return getTotalNumbers(candidate + increase, increase, max, total, a, b)
}

fun areAllFactors(candidate: Int, factors: Array<Int>): Boolean {
    for (factor in factors) if (candidate % factor != 0) return false
    return true
}

fun isFactorOfAll(candidate: Int, factors: Array<Int>): Boolean {
    for (factor in factors) if (factor % candidate != 0) return false
    return true
}