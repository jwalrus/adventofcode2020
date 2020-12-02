package jwalrus.adventofcode

import arrow.core.ListK
import arrow.core.extensions.fx
import arrow.core.k

fun List<Int>.day1a(target: Int): Int = this.k().run {
    ListK.fx {
        val x = !this@run
        val y = !this@run.filter { it != x && x + it == target }.k()
        x to y
    }.first().let { (x,y) -> x * y }
}

fun List<Int>.day1b(target: Int): Int = this.k().run {
    ListK.fx {
        val x = !this@run
        val y = !this@run.filter { it != x }.k()
        val z = !this@run.filter { it != x && it != y && x + y + it == target }.k()
        Triple(x, y, z)
    }.first().let { (x, y, z) -> x * y * z }
}