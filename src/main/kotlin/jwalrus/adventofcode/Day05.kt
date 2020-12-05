package jwalrus.adventofcode


object Day05 {

    fun partition(s: String): Pair<String, String> = Pair(s.take(7), s.takeLast(3))

    fun interval(l: Int, u: Int): Int = (u - l) / 2

    tailrec fun find(s: String, l: Int, u: Int): Int =
        when (s.firstOrNull()) {
            'F', 'L' -> find(s.drop(1), l, l + interval(l, u))
            'B', 'R' -> find(s.drop(1), u - interval(l, u), u)
            else -> l
        }

    fun column(s: String): Int = find(s, 0, 127)

    fun row(s: String): Int = find(s, 0, 7)

    fun seat(s: String): Int = partition(s)
        .let { (col, row) -> Pair(column(col), row(row)) }
        .let { (col, row) -> col * 8 + row }

    fun part1(xs: List<String>): Int = xs.map(Day05::seat).maxOrNull() ?: 0

    fun part2(xs: List<String>): Int {
        val min = 0
        val max = part1(xs)
        val allSeats = (min..max).toSet()
        val ticketed = xs.map(Day05::seat).toSet()
        return (allSeats - ticketed).let { seats ->
            seats.filter { it != 0 && it != max }
                .first { (it - 1) !in seats && (it + 1) !in seats }
        }
    }
}