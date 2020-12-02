package jwalrus.adventofcode

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.ints.shouldBeExactly
import java.nio.file.Paths

class Day01Spec : DescribeSpec ({

    val sample = listOf(1721, 979, 366, 299, 675, 1456)
    val challenge = Paths.get("src", "test", "resources", "day1_data.txt")
        .toFile().readLines().map(String::toInt)

    describe("part 1") {

        it("sample data = 514,579") {
            sample.day1a(2020) shouldBeExactly 514_579
        }

        it("challenge data = 928,896") {
            challenge.day1a(2020) shouldBeExactly 928_896
        }
    }

    describe("part 2") {

        it("sample data = ") {
            sample.day1b(2020) shouldBeExactly 241_861_950
        }

        it("challenge data = 295,668,576") {
            challenge.day1b(2020) shouldBeExactly 295_668_576
        }
    }
})
