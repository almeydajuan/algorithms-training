package com.juanalmeyda.training

// https://www.hackerrank.com/challenges/kangaroo
fun main(args: Array<String>) {
    println(kangaroo(0, 3, 4, 2))
    println(kangaroo(0, 2, 5, 3))
    println(kangaroo(43, 2, 70, 2))
}

fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
    if (samePlace(x1, v1, x2, v2)) return "YES"
    if (isNotPossible(x1, v1, x2, v2)) return "NO"
    return if (x1 < x2) calculateJumps(x1, v1, x2, v2) else calculateJumps(x2, v2, x1, v1)
}

fun calculateJumps(x1: Int, v1: Int, x2: Int, v2: Int): String {
    if (x1 == x2) return "YES"
    if (x1 > x2) return "NO"
    return calculateJumps(x1 + v1, v1, x2 + v2, v2)
}

fun isNotPossible(x1: Int, v1: Int, x2: Int, v2: Int): Boolean =
        (x1 >= x2 && v1 > v2) || (x2 >= x1 && v2 > v1) || (x1 == x2 && v1 != v2) || (x1 != x2 && v1 == v2)

fun samePlace(x1: Int, v1: Int, x2: Int, v2: Int): Boolean = x1 == x2 && v1 == v2