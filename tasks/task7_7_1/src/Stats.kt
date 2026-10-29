// Task 7.7.1: statistics functions

fun median(data: List<Float>): Float {
    val sorted - data.sorted()
    val middle = sorted.size / 2

    return if (sorted.size % 2 == 1) {
        sorted[middle]
    } else {
        (sorted[middle - 1] + sorted[middle]) /2f
    
    }
}

fun displayStats(data: List<Float>) {
    println("Minimum: ${data.minOrNull()}")
    println("Maximum: ${data.maxOrNull()}")
    println("Mean: ${data.average()}")
    println("Median: ${median(data)}")
}