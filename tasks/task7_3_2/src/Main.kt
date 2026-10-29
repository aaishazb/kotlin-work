// Task 7.3.1: list element access
fun main() {
    val numbers = mutableListOf(9, 3, 6, 2, 8, 5)
    numbers.add(1, 4)
    println(numbers)
    
    numbers.addAll(listOf(7, 0))
    println(numbers)

    numbers.remove(9)
    println(numbers)

    numbers.removeAll(listOf(2, 5))
    println(numbers)

    numbers.removeAt(3)
    println(numbers) 

}