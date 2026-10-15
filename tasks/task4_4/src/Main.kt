// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Please provide three temperatures as command line arguments.")
        return
    }

    val initialTemp = args[0].toDouble()
    val maxTemp = args[1].toDouble()
    val increment = args[2].toDouble()

    var celsius = initialTemp

    while(celsius <= maxTemp) {
        val fahrenheit = (celsius * 9/5) + 32
        println("%10.1f %10.1f".format(celsius, fahrenheit))
        celsius += increment
    }
}
