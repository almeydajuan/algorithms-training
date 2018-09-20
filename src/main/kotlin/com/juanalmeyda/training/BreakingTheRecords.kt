package com.juanalmeyda.training

// https://www.hackerrank.com/challenges/breaking-best-and-worst-records
fun main(args: Array<String>) {
    //println(breakingRecords(arrayOf(10,5,20,20,4,5,2,25,1)))
    val records = breakingRecords(arrayOf(0,9,3,10,2,20))
    println(records[0])
    println(records[1])
}

// Complete the breakingRecords function below.
fun breakingRecords(scores: Array<Int>): Array<Int> {
    val firstValue = scores[0]
    return calculateRecords(scores.drop(1).toTypedArray(), arrayOf(0,0), arrayOf(firstValue,firstValue))
}

fun calculateRecords(scores: Array<Int>, brokenRecords: Array<Int>, records: Array<Int>): Array<Int> {
    // base case
    if (scores.isEmpty()) return brokenRecords
    val currentPoints = scores[0]

    // recursive case
    if (currentPoints > records[MAX]) {
        brokenRecords[MAX]++
        records[MAX] = currentPoints
    }
    if (currentPoints < records[MIN]) {
        brokenRecords[MIN]++
        records[MIN] = currentPoints
    }
    return calculateRecords(scores.drop(1).toTypedArray(), brokenRecords, records)
}

const val MIN = 1
const val MAX = 0