def isANumber(s):
    try:
        int(s)
        return True
    except ValueError:
        return False

def removeNonInts(array):
    finalArray = []
    for current in array:
        if isANumber(current):
            finalArray.append(int(current))
    return finalArray

def printMessage(msg):
    sep = "\n*******************************************\n"
    print(sep + msg + sep)