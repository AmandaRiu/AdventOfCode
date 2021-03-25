fun main(args: Array<String>) {
    if (args.isEmpty()) {
        printMessage("Please add some command line arguments")
        return
    }

    for (item in args) {
        // Make sure we're only working with valid numbers
        item.toIntOrNull()?.let { current ->
            // Create an array that does not contain the 
            // current number and only contains numbers
            var remainingItems:List<Int> = args
                .filter { it.toIntOrNull() != current }
                .mapNotNull{ it.toIntOrNull() }

            for (other in remainingItems) {
                if (other + current == 2020) {
                    val product = other * current
                    printMessage(
                        "The product of $current and $other is $product"
                    )
                    return
                }
            }
        }
    }
    printMessage("No sum of two numbers equal 2020")
}

fun printMessage(msg: String) {
    val sep = "\n*******************************************\n"
    print("$sep $msg $sep")
}