// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Please provide only a single integer as a command line argument.")
        return
    }

    val x = args[0].toInt()
    var sum = 0L

    for (i in 1..x) {
        if (i % 2 == 1) {
            sum += i
        }
    }

    println(sum)
}
