package jwalrus.adventofcode

import java.nio.file.Paths

fun load(name: String): List<String>
        = Paths.get("src", "test", "resources", name).toFile().readLines()

fun loadText(name: String): String
        = Paths.get("src", "test", "resources", name).toFile().readText()

fun loadGroups(name: String): List<List<String>>
        = loadText(name).split("\n\n").map { it.trim().split("\n") }
