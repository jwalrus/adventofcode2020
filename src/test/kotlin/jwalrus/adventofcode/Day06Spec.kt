package jwalrus.adventofcode

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.ints.shouldBeExactly
import jwalrus.adventofcode.Day06.part1
import jwalrus.adventofcode.Day06.part2
import jwalrus.adventofcode.util.loadGroups

class Day06Spec : DescribeSpec({

    val sample = loadGroups("day06_data_sample.txt")
    val challenge = loadGroups("day06_data.txt")

    describe("part 1") {

        it("sample data = 11") {
            sample.part1() shouldBeExactly 11
        }

        it("challenge data = 6534") {
            challenge.part1() shouldBeExactly 6534
        }
    }

    describe("part 2") {

        it("sample data = 6") {
            sample.part2() shouldBeExactly 6
        }

        it("challenge data = 3402") {
            challenge.part2() shouldBeExactly 3402
        }
    }
})