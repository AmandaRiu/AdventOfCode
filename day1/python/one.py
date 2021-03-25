import sys
import utils

# Exit if no arguments provided
if len(sys.argv) == 1:
    print('Please add some command line arguments')
    exit()

args = utils.removeNonInts(sys.argv)
for current in args:
    remaining = args.copy()
    remaining.remove(current)
    for other in remaining:
        sum = other + current
        if sum == 2020:
            result = other * current
            utils.printMessage("The product of " + str(current) + " and " + str(other) + " is " + str(result))
            exit()
utils.printMessage("No sum of two numbers equal 2020")