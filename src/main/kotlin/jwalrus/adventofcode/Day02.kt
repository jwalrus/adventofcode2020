package jwalrus.adventofcode

import arrow.core.Tuple4

private typealias Row = Tuple4<Int, Int, Char, String>

private val regex: Regex = "^(\\d+)-(\\d+) ([A-Za-z]): (.+)$".toRegex()

private fun String.toRow(): Row = regex.find(this)!!.destructured
        .let { (a,b,c,d) -> Tuple4(a.toInt(), b.toInt(), c.toCharArray()[0], d) }

private fun String.containsCharBetween(c: Char, lower: Int, upper: Int): Boolean
    = count { it == c } in lower..upper

private fun String.containsCharAtIndexExactlyOnce(c: Char, ix: Set<Int>): Boolean
    = filterIndexed { index, char ->  (index + 1) in ix && char == c }.length == 1

fun List<String>.part1(): Int = asSequence().map { it.toRow() }
        .filter { tup -> tup.d.containsCharBetween(tup.c, tup.a, tup.b) }
        .count()

fun List<String>.part2(): Int = asSequence().map { it.toRow() }
        .filter { tup -> tup.d.containsCharAtIndexExactlyOnce(tup.c, setOf(tup.a, tup.b)) }
        .count()