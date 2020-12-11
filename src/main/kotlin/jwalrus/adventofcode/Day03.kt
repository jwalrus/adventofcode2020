package jwalrus.adventofcode

import jwalrus.adventofcode.util.load

class SledMap(private val map: List<String>) {

    private val height = map.size
    private val width = map.first().length

    private fun treesOnPath(down: Int, right: Int): Long {
        tailrec fun go(x: Int, y: Int, acc: Long): Long {
            return if (x >= height) acc
            else go(x + down, (y + right) % width, if (map[x][y] == '#') acc + 1 else acc)
        }
        return go(down, right, 0)
    }

    fun part1(down: Int, right: Int): Long = treesOnPath(down, right)

    fun part2(slopes: List<Pair<Int, Int>>): Long = slopes.map { (x, y) -> treesOnPath(x, y) }.reduce(Long::times)
}

fun main() {
    val sample = load("day03_data_sample.txt")
    val challenge = load("day03_data.txt")

    println(SledMap(sample).part1(1, 3)) // 7
    println(SledMap(challenge).part1(1, 3)) // 289

    val slopes = listOf(
        1 to 1,
        1 to 3,
        1 to 5,
        1 to 7,
        2 to 1
    )

    println(SledMap(sample).part2(slopes)) // 336
    println(SledMap(challenge).part2(slopes)) // 5_522_401_584
}