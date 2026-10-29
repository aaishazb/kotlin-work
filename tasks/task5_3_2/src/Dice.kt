// Task 5.3.2: rollDice() function
import kotlin.random.Random

fun rollDice(sides: Int=6, dice: Int=1) {
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        var total = 0

        repeat(dice) {
            val result = Random.nextInt(1, sides + 1)
            total += result
        }

        println("Rolling $dice d$sides...")
        println("You rolled a total of $total")
    }

    else {
        println("Error: cannot have a $sides-sided die")
    }

}