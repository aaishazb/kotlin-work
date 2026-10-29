// Task 7.3.1: list element access
fun main() {
    val numbers = listOf(9, 3, 6, 2, 8, 5)
    println(numbers)
    println()
    println(numbers[0])
    println()
    println(numbers.slice(2..4))
    println()
    println(numbers.first())
    println(numbers.last())
}