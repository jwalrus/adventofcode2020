package jwalrus.adventofcode

import java.nio.file.Paths

fun load(name: String): List<String>
        = Paths.get("src", "test", "resources", name).toFile().readLines()