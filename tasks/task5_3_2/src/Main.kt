// Task 5.3.2: main program

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Please provide a dice specification, e.g. 3d8")
        return
    }

    val specification = args[0]
    val dice = specification.substringBefore("d").toInt()
    val sides = specification.substringAfter("d").toInt()

    rollDice(sides = sides, dice = dice)
}