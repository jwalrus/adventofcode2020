package jwalrus.adventofcode

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.ints.shouldBeExactly
import io.kotest.matchers.shouldBe
import jwalrus.adventofcode.Day05.find
import jwalrus.adventofcode.Day05.interval
import jwalrus.adventofcode.Day05.part1
import jwalrus.adventofcode.Day05.part2
import jwalrus.adventofcode.Day05.partition
import jwalrus.adventofcode.Day05.seat

class Day05Spec : DescribeSpec({

    val challenge = load("day05_data.txt").also(::println)

    describe("part 1") {

        it("partition") {
            partition("FBFBBFFRLR") shouldBe Pair("FBFBBFF", "RLR")
        }

        it("interval") {
            interval(0, 127) shouldBeExactly 63
            interval(0, 63) shouldBeExactly 31
            interval(32, 63) shouldBeExactly 15
        }

        it("find") {
            find("FBFBBFF", 0, 127) shouldBeExactly 44
            find("BFFFBBF", 0, 127) shouldBeExactly 70
        }

        it("seat") {
            seat("BFFFBBFRRR") shouldBeExactly 567
            seat("FFFBBBFRRR") shouldBeExactly 119
            seat("BBFFBBFRLL") shouldBeExactly 820
        }

        it("challenge data = 835") {
            part1(challenge) shouldBeExactly 835
        }
    }

    describe("part 2") {

        it("challenge data = 649") {
            part2(challenge) shouldBeExactly 649
        }
    }
})