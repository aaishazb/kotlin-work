// Task 5.2.1: main program
fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Please provide only a single radius value as a command line argument.")
        return
    }

    val radius = args[0].toDouble()

    val x = circleArea(radius)
    val y = circlePerimeter(radius)

    printf("Area of the circle: %.4f", x)
    printf("Perimeter of the circle: %.4f\n", y)
}