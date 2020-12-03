package jwalrus.adventofcode

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.longs.shouldBeExactly

class Day03Spec : DescribeSpec({

    val sample = load("day03_data_sample.txt")
    val challenge = load("day03_data.txt")

    describe("part 1") {

        it("sample data = 7") {
            Map(sample).part1(1, 3) shouldBeExactly 7
        }

        it("challenge data = 289") {
            Map(challenge).part1(1, 3) shouldBeExactly 289
        }
    }

    describe("part 2") {

        val slopes = listOf(
            1 to 1,
            1 to 3,
            1 to 5,
            1 to 7,
            2 to 1
        )

        it("sample data = 336") {
            Map(sample).part2(slopes) shouldBeExactly 336
        }

        it("challenge data = 5,522,401,584") {
            Map(challenge).part2(slopes) shouldBeExactly 5_522_401_584
        }
    }
})