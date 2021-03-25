# Solution

_Arguments have been saved to a text file_: `args.txt`

**Compile with**

```
// Kotlin
kotlinc one.kt -include-runtime -d kotlin/one.jar
kotlinc two.kt -include-runtime -d kotlin/two.jar
```

**Run with**

```
// Kotlin
cat args.txt | xargs -t java -jar kotlin/one.jar
cat args.txt | xargs -t java -jar kotlin/two.jar

// Python
cat args.txt | xargs -t python3 python/one.py
cat args.txt | xargs -t python3 python/two.py
```

---

# Day 1: Report Repair

The Elves in accounting just need you to fix your expense report (your puzzle input); apparently, something isn't quite adding up.

Specifically, they need you to find the two entries that sum to 2020 and then multiply those two numbers together.

For example, suppose your expense report contained the following:

```
1721
979
366
299
675
1456
```

In this list, the two entries that sum to `2020` are `1721` and `299`. Multiplying them together produces `1721 * 299 = 514579`, so the correct answer is `514579`.

Of course, your expense report is much larger. Find the two entries that sum to `2020`; what do you get if you multiply them together?

> Your puzzle answer was `731731`.

## Part Two

The Elves in accounting are thankful for your help; one of them even offers you a starfish coin they had left over from a past vacation. They offer you a second one if you can find three numbers in your expense report that meet the same criteria.

Using the above example again, the three entries that sum to `2020` are `979`, `366`, and `675`. Multiplying them together produces the answer, `241861950`.

In your expense report, what is the product of the three entries that sum to `2020`?

> Your puzzle answer was `116115990`.
>
> Both parts of this puzzle are complete! They provide two gold stars: \*\*
>
> At this point, you should return to your Advent calendar and try another puzzle.
