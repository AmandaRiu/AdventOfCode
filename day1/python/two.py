import sys
import utils

# Exit if no arguments provided
if len(sys.argv) == 1:
    print('Please add some command line arguments')
    exit()

args = utils.removeNonInts(sys.argv)
for first in args:
    remainingItems = args.copy()
    remainingItems.remove(first)
    for second in remainingItems:
        otherItems = remainingItems.copy()
        otherItems.remove(second)
        for third in otherItems:
            sum = first + second + third
            if sum == 2020:
                result = first * second * third
                utils.printMessage("The product of " + str(first) + ", " + str(second) + " and " + str(third) + " is " + str(result))
                exit()
utils.printMessage("No sum of three numbers equal 2020")