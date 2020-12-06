package jwalrus.adventofcode

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.ints.shouldBeExactly
import jwalrus.adventofcode.Day02.part1
import jwalrus.adventofcode.Day02.part2
import jwalrus.adventofcode.util.load

class Day02Spec : DescribeSpec({

    val sample = listOf("1-3 a: abcde", "1-3 b: cdefg", "2-9 c: ccccccccc")
    val challenge = load("day02_data.txt")

    describe("part 1") {

        it("sample has two valid passwords") {
            sample.part1() shouldBeExactly 2
        }

        it("challenge has 500 valid passwords") {
            challenge.part1() shouldBeExactly 500
        }
    }

    describe("part 2") {

        it("sample has one valid password") {
            sample.part2() shouldBeExactly 1
        }

        it("challenge has 313 valid passwords") {
            challenge.part2() shouldBeExactly 313
        }
    }
})