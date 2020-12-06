package jwalrus.adventofcode

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.ints.shouldBeExactly
import jwalrus.adventofcode.util.load

class Day04Spec : DescribeSpec({

    val sample = load("day04_data_sample.txt").also(::println)
    val validSample = load("day04_data_sample_valid.txt")
    val challenge = load("day04_data.txt").also(::println)

    describe("part 1") {

        it("sample data = 2") {
            DayO4.run { sample.part1() } shouldBeExactly 2
        }

        it("challenge data = 228") {
            DayO4.run { challenge.part1() } shouldBeExactly 228
        }
    }

    describe("part 2") {

        it("sample data (valid) = 4") {
            DayO4.run { validSample.part2() } shouldBeExactly 4
        }

        it("challenge data = 174") {
            DayO4.run { challenge.part2() } shouldBeExactly 175
        }
    }
})