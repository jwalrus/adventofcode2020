package jwalrus.adventofcode

import arrow.core.ListK
import arrow.core.extensions.fx
import arrow.core.k

/* **************************
 * Take 1: Using ListK Monad
 * **************************/
object Day01Monad {

    fun List<Int>.part1(target: Int): Int = this.k().run {
        ListK.fx {
            val x = !this@run
            val y = !this@run.filter { it != x && x + it == target }.k()
            x to y
        }.first().let { (x, y) -> x * y }
    }

    // stupid inefficient
    fun List<Int>.part2(target: Int): Int = this.k().run {
        ListK.fx {
            val x = !this@run
            val y = !this@run.filter { it != x }.k()
            val z = !this@run.filter { it != x && it != y && x + y + it == target }.k()
            Triple(x, y, z)
        }.first().let { (x, y, z) -> x * y * z }
    }
}

/* *************************************************
 * Take 2: More efficient kotlin-only implementation
 * *************************************************/
object Day01 {

    private fun List<Int>.go_(target: Int): Int? = asSequence()
        .firstOrNull { binarySearch(target - it) > -1 }
        ?.let { it * (target - it) }

    fun List<Int>.part1(target: Int): Int? = sorted().go_(target)

    fun List<Int>.part2(target: Int): Int? {
        tailrec fun go(x: Int, xs: List<Int>): Int? = when (val result = xs.go_(target - x)) {
            null -> go(xs[0], xs.drop(1))
            else -> x * result
        }

        return when (isNotEmpty()) {
            true -> sorted().let { go(it[0], it.drop(1)) }
            false -> null
        }
    }
}

