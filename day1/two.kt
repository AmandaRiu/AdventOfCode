fun main(args: Array<String>) {
    if (args.isEmpty()) {
        print("Please add some command line arguments")
        return
    }
    for (first in args) {
        // Break out of loop if first value is not a number
        if (first.toIntOrNull() == null) continue;

        val remainingItems = args.filter { it != first}
        for (second in remainingItems) {
            // Break out of loop if second value is not a number
            if (second.toIntOrNull() == null) continue;

            val otherItems = remainingItems.filter { it != first && it != second }
            for (third in otherItems) {
                // Break out of loop if third value is not a number
                if (third.toIntOrNull() == null) continue;

                if (first.toInt() + second.toInt() + third.toInt() == 2020) {
                    val result = first.toInt() * second.toInt() * third.toInt()
                    print("\nThe product of ${first}, ${second} and $third is ${result}")
                    return
                }
            }
            
            
        }
    }
    print("\n\nNo three numbers equal the sum of 2020")
}