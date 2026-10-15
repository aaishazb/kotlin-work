// Task 4.2: use of if and ranges

fun main() {
    println("""
    PIZZA MENU

    (a) Margherita
    (b) Quattro Stagioni
    (c) Seafood
    (d) Hawaiian""")

    print("Choose your pizza (a-d): ") 

    var choice = readln().lowercase()

    if (choice.length == 1 && choice[0] in 'a'..'d') {
        println("Order accepted")
    } else {
        print("Invalid choice. Please choose a pizza from the menu (a-d)")
    }
}