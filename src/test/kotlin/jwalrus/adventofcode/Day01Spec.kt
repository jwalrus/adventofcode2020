package jwalrus.adventofcode

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.ints.shouldBeExactly

class Day01Spec : DescribeSpec ({

    val sample = listOf(1721, 979, 366, 299, 675, 1456)
    val challenge = load("day01_data.txt").map(String::toInt)

    describe("part 1") {

        it("sample data = 514,579") {
            sample.part1(2020) shouldBeExactly 514_579
        }

        it("challenge data = 928,896") {
            challenge.part1(2020) shouldBeExactly 928_896
        }
    }

    describe("part 2") {

        it("sample data = 241,861,950") {
            sample.part2(2020) shouldBeExactly 241_861_950
        }

        it("challenge data = 295,668,576") {
            challenge.part2(2020) shouldBeExactly 295_668_576
        }
    }

    describe("part 1 (take 2)") {

        it("sample data = 514,579") {
            sample.part1take2(2020)!! shouldBeExactly 514_579
        }

        it("challenge data = 928,896") {
            challenge.part1take2(2020)!! shouldBeExactly 928_896
        }
    }

    describe("part 2 (take 2)") {

        it("sample data = 241,861,950") {
            sample.part2take2(2020)!! shouldBeExactly 241_861_950
        }

        it("challenge data = 295,668,576") {
            challenge.part2take2(2020)!! shouldBeExactly 295_668_576
        }
    }
})
