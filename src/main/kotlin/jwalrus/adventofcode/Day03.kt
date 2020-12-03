package jwalrus.adventofcode

class Map(private val map: List<String>) {

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

    fun part2(slopes: List<Pair<Int, Int>>): Long = slopes.map { (x,y) -> treesOnPath(x,y) }.reduce(Long::times)
}