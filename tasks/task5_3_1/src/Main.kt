// Task 5.1.2: main program

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        rollDie()
        return
    }

    else if (args.size != 1) {
        println("Please provide only a single number of sides as a command line argument.")
        return
    }

    val sides = args[0].toInt()
    rollDie(sides)
}
