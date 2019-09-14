package moe.leekcake.we.sample

import moe.leekcake.we.basekit.Builder
import java.io.File

fun main(args: Array<String>) {
    val builder = Builder(SampleProject(), "sample")
    builder.build( File(args[0]) )
}