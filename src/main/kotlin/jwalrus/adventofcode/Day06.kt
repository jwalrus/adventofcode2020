package jwalrus.adventofcode

object Day06 {

    private fun commonAnswers(xs: List<String>): Set<Char>
        = xs.map(CharSequence::toSet).reduce(Set<Char>::intersect)

    private fun uniqueAnswers(xs: List<String>): Set<Char>
        = xs.map(CharSequence::toSet).reduce(Set<Char>::union)

    fun List<List<String>>.part1() = map(Day06::uniqueAnswers).map(Set<Char>::size).sum()

    fun List<List<String>>.part2() = map(Day06::commonAnswers).map(Set<Char>::size).sum()
}